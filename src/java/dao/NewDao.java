/*
* NewDao.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
*/
package dao;

import entity.News;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DBContext;

/**
 * NewDAO.<br>
 *
 * <pre>
 * Class dùng các câu query để lấy dữ liệu từ database
 *
 * . GetNewsById.
 * . SearchNewsByTitle
 * . CountNewsWhenSearch
 * . GetTop5NewsRecent
 *
 *
 * </pre>
 *
 * @author dangt
 */
public class NewDao extends DBContext {

    /**
     * GetNewById.<br>
     * Truyền vào id và tìm bài báo giống id đó.
     *
     * @param id
     * @return a News
     */
    public News getNewById(int id) {
        String sql = "SELECT * FROM dbo.Digital WHERE ID =?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                News n = new News();
                n.setId(rs.getInt("ID"));
                n.setTitle(rs.getString("title"));
                n.setDescription(rs.getString("description"));
                n.setImage(rs.getString("image"));
                n.setAuthor(rs.getString("author"));
                n.setPostTime(rs.getDate("timePost"));
                n.setShortDes(rs.getString("shortDes"));
                return n;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    /**
     * GetTop5NewRecent.<br>
     * Lấy ra 5 bài báo gần nhất.
     *
     * @param number
     * @return a list new
     */
    public List<News> getTopNew(int number) {
        List<News> listNews = new ArrayList<>();
        String sql = "SELECT TOP(?)* FROM dbo.Digital ORDER BY timePost DESC";
        try (PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setInt(1, number);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                News n = new News();
                n.setId(rs.getInt("ID"));
                n.setTitle(rs.getString("title"));
                n.setDescription(rs.getString("description"));
                n.setImage(rs.getString("image"));
                n.setAuthor(rs.getString("author"));
                n.setPostTime(rs.getDate("timePost"));
                n.setShortDes(rs.getString("shortDes"));
                listNews.add(n);

            }
        } catch (SQLException ex) {
            Logger.getLogger(NewDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNews;
    }

    /**
     * CountNewWhenSearch.<br>
     * Đếm số bài báo thỏa mãn tiêu đề được tìm kiếm.
     *
     * @param title
     * @return a number of new
     */
    public int countNewWhenSearch(String title) {
        String sql = "SELECT COUNT(*) FROM dbo.Digital WHERE title LIKE ?";
        try (PreparedStatement statement = connection.prepareStatement(sql);) {

            statement.setString(1, "%" + title + "%");
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    /**
     * SearchNewByTitle.<br>
     * Tìm kiếm theo tiêu đề, trả về danh sách các bài báo thỏa mãn tìm kiếm.
     *
     *
     * @param title
     * @param start
     * @param end
     * @return a list News
     */
    public List<News> searchNewByTitle(String title,int start, int end) {
        List<News> listNews = new ArrayList<>();

        String sql = "SELECT * FROM(SELECT *,ROW_NUMBER() OVER (ORDER BY id DESC) as row_num "
                + "FROM dbo.Digital WHERE title LIKE ?) AS news WHERE row_num >= ? AND row_num<= ?";
        try (PreparedStatement statement = connection.prepareStatement(sql);) {

            statement.setString(1, "%" + title + "%");
            
            statement.setInt(2, start);
            statement.setInt(3, end);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                News n = new News();
                n.setId(rs.getInt("ID"));
                n.setTitle(rs.getString("title"));
                n.setDescription(rs.getString("description"));
                n.setImage(rs.getString("image"));
                n.setAuthor(rs.getString("author"));
                n.setPostTime(rs.getDate("timePost"));
                n.setShortDes(rs.getString("shortDes"));
                listNews.add(n);

            }
        } catch (SQLException ex) {
            Logger.getLogger(NewDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNews;
    }

}
