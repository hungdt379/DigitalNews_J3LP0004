/*
* SearchController.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
*/
package controller;

import dao.NewDao;
import entity.News;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SearchController.<br>
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
public class SearchController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods. Lấy title đã nhập vào ô tìm kiếm thực hiện tìm kiếm và phân
     * trang
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        NewDao newDao = new NewDao();
        String text = request.getParameter("inputSearch");

        int pageCount = newDao.countNewWhenSearch(text);
        System.out.println("page count = " + pageCount);
        String page_raw = request.getParameter("page");
        if (page_raw == null) {
            page_raw = "1";
        }

        int pageIndex = Integer.parseInt(page_raw);
        int pageSize = 4;

        if (pageCount % pageSize == 0) {
            pageCount = pageCount / pageSize;
        } else {
            pageCount = (pageCount / pageSize) + 1;
        }

        int start = (pageIndex - 1) * pageSize + 1;
        int end = pageIndex * pageSize;

        List<Integer> listCount = new ArrayList<>();
        for (int i = 1; i <= pageCount; i++) {
            listCount.add(i);
        }
        
        List<News> listNews = newDao.searchNewByTitle(text,start, end);
        List<News> listTop5 = newDao.getTopNew(5);

        request.setAttribute("page", pageIndex);
        request.setAttribute("text", text);
        request.setAttribute("listNews", listNews);
        request.setAttribute("listCount", listCount);
        request.setAttribute("listTop5", listTop5);

        request.getRequestDispatcher("search.jsp").forward(request, response);

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
