package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import common.DBConn;

@WebServlet("/api/join")
public class JoinServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String id = request.getParameter("userId");
        String pw = request.getParameter("userPw");
        String name = request.getParameter("userName");

        if (id == null || id.trim().isEmpty() || 
            pw == null || pw.trim().isEmpty() || 
            name == null || name.trim().isEmpty()) {
            response.sendRedirect(request.getContextPath() + "/join.html?error=empty");
            return;
        }

        String sql = "INSERT INTO USERS (USER_ID, USER_PW, USER_NAME) VALUES (?, ?, ?)";

        try (Connection conn = DBConn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id.trim());
            pstmt.setString(2, pw.trim());
            pstmt.setString(3, name.trim());

            int result = pstmt.executeUpdate();

            if (result > 0) {
                response.sendRedirect(request.getContextPath() + "/login.html");
            } else {
                response.sendRedirect(request.getContextPath() + "/join.html?error=fail");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            if (e.getErrorCode() == 1) { // 무결성 제약조건 위배 (중복 아이디)
                response.sendRedirect(request.getContextPath() + "/join.html?error=duplicate");
            } else {
                response.sendRedirect(request.getContextPath() + "/join.html?error=db_error");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/join.html?error=exception");
        }
    }
}