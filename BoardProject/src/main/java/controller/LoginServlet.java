package controller;

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

// 앞에 슬래시(/) 추가
@WebServlet("/api/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 요청 한글 인코딩 설정
        request.setCharacterEncoding("UTF-8");

        String id = request.getParameter("userId");
        String pw = request.getParameter("userPw");

        String sql = "SELECT USER_ID FROM USERS WHERE USER_ID = ? AND USER_PW = ?";

        // 2. try-with-resources 구문으로 Connection, PreparedStatement 자동 반납
        try (Connection conn = DBConn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id);
            pstmt.setString(2, pw);

            // 3. ResultSet 자원 자동 닫기 처리
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    // 로그인 성공 시 세션에 아이디 저장
                    HttpSession session = request.getSession();
                    session.setAttribute("loginUser", rs.getString("USER_ID"));
                    
                    // 프로젝트 경로(ContextPath)를 포함하여 board.html로 이동
                    response.sendRedirect(request.getContextPath() + "/board.html");
                } else {
                    // 로그인 실패 시: 에러 파라미터를 붙여 login.html로 이동
                    response.sendRedirect(request.getContextPath() + "/login.html?error=1");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            // 서버 오류 발생 시 로그인 페이지로 복귀
            response.sendRedirect(request.getContextPath() + "/login.html?error=server");
        }
    }
}