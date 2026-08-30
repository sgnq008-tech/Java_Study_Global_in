package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("api/auth")
public class AuthServlet extends HttpServlet {
    // 세션 사용자 확인
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        HttpSession session = request.getSession(false);
        String user = (session != null) ? (String) session.getAttribute("loginUser") : null;
        response.getWriter().print(user != null ? user : "");
    }

    // 로그아웃
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null) session.invalidate();
        response.sendRedirect("/login.html");
    }
}