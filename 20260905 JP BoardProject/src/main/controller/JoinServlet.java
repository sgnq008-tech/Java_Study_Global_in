package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
        // リクエスト文字コードの設定
        request.setCharacterEncoding("UTF-8");

        String userId = request.getParameter("userId");
        String userPw = request.getParameter("userPw");
        String userName = request.getParameter("userName");

        // 入力値の簡易バリデーション
        if (userId == null || userId.trim().isEmpty() ||
            userPw == null || userPw.trim().isEmpty() ||
            userName == null || userName.trim().isEmpty()) {
            response.sendRedirect(request.getContextPath() + "/join.html?error=empty");
            return;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DBConn.getConnection();
            String sql = "INSERT INTO USERS (USER_ID, USER_PW, USER_NAME) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userId.trim());
            pstmt.setString(2, userPw.trim());
            pstmt.setString(3, userName.trim());

            int result = pstmt.executeUpdate();
            if (result > 0) {
                // 登録成功時：ログイン画面へリダイレクト
                response.sendRedirect(request.getContextPath() + "/login.html");
            } else {
                response.sendRedirect(request.getContextPath() + "/join.html?error=fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // 主キー重複（ORA-00001）などの例外発生時
            response.sendRedirect(request.getContextPath() + "/join.html?error=duplicate");
        } finally {
            DBConn.close(pstmt, conn);
        }
    }
}