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

@WebServlet("/api/board")
public class BoardServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // GET: 投稿一覧をJSON配列形式で返却
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("application/json; charset=UTF-8");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        StringBuilder json = new StringBuilder("[");

        try {
            conn = DBConn.getConnection();
            String sql = "SELECT BNO, TITLE, WRITER, TO_CHAR(REG_DATE, 'YYYY-MM-DD HH24:MI') AS REG_DATE " +
                         "FROM BOARD ORDER BY BNO DESC";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            boolean isFirst = true;
            while (rs.next()) {
                if (!isFirst) json.append(",");
                json.append("{")
                    .append("\"bno\":").append(rs.getInt("BNO")).append(",")
                    .append("\"title\":\"").append(escapeJson(rs.getString("TITLE"))).append("\",")
                    .append("\"writer\":\"").append(escapeJson(rs.getString("WRITER"))).append("\",")
                    .append("\"regDate\":\"").append(rs.getString("REG_DATE")).append("\"")
                    .append("}");
                isFirst = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConn.close(rs, pstmt, conn);
        }
        json.append("]");
        response.getWriter().write(json.toString());
    }

    // POST: 新規投稿の保存処理
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession(false);
        String writer = (session != null) ? (String) session.getAttribute("loginId") : null;

        // ログインしていない場合はログイン画面へリダイレクト
        if (writer == null) {
            response.sendRedirect(request.getContextPath() + "/login.html");
            return;
        }

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DBConn.getConnection();
            String sql = "INSERT INTO BOARD (BNO, TITLE, CONTENT, WRITER, REG_DATE) " +
                         "VALUES (SEQ_BOARD_BNO.NEXTVAL, ?, ?, ?, SYSDATE)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setString(3, writer);
            pstmt.executeUpdate();

            response.sendRedirect(request.getContextPath() + "/board.html");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/board.html?error=save");
        } finally {
            DBConn.close(pstmt, conn);
        }
    }

    // 特殊文字のエスケープ処理
    private String escapeJson(String value) {
        if (value == null) return "";
        return value.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}