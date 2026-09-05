package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import common.DBConn;

@WebServlet("/api/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String userId = request.getParameter("userId");
        String userPw = request.getParameter("userPw");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DBConn.getConnection();
            String sql = "SELECT USER_NAME FROM USERS WHERE USER_ID = ? AND USER_PW = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userId);
            pstmt.setString(2, userPw);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                // 認証成功：セッションにログイン情報を記録
                HttpSession session = request.getSession();
                session.setAttribute("loginId", userId);
                session.setAttribute("loginName", rs.getString("USER_NAME"));

                // 掲示板へリダイレクト
                response.sendRedirect(request.getContextPath() + "/board.html");
            } else {
                // 認証失敗
                response.sendRedirect(request.getContextPath() + "/login.html?error=1");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/login.html?error=server");
        } finally {
            DBConn.close(rs, pstmt, conn);
        }
    }
}