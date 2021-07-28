/*
* HomeController.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
*/
package controller;

import dao.NewDao;
import entity.News;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HomeController.<br>
 *
 * <pre>
 * Class lấy dữ liệu từ database Thông qua class NewsDao và đẩy dữ liệu lên view để hiển thị lên trình duyệt
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * . ProcessRequest.
 * . DoGet.
 * . DoPost.
 *
 *
 * </pre>
 *
 * @author dangt
 */
public class HomeController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods. Lấy id và trả về bài đăng theo id Lấy ra top 5 bài đăng gần đây
     *
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        NewDao newDao = new NewDao();
        String raw_id = request.getParameter("id");

        News curNew;
        if (raw_id == null) {
            curNew = newDao.getTopNew(1).get(0);
        } else {
            //getNewById để lấy bài báo có id bằng id cua bai bao duoc chon
            curNew = newDao.getNewById(Integer.parseInt(raw_id));
        }

        //getTop5NewsRecent để lấy ra 5 bài báo gần đây
        List<News> listTop5 = newDao.getTopNew(5);

        request.setAttribute("curNew", curNew);
        request.setAttribute("listTop5", listTop5);

        //Đẩy dữ liệu lên home.jsp
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
