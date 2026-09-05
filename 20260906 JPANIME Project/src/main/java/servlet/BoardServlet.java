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

@WebServlet("/api/board")
public class BoardServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // GET: アニメレビューリストのJSON取得
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
            String sql = "SELECT BNO, ANIME_TITLE, TITLE, RATING, WRITER, " +
                         "TO_CHAR(REG_DATE, 'YYYY-MM-DD HH24:MI') AS REG_DATE " +
                         "FROM ANIME_REVIEWS ORDER BY BNO DESC";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            boolean isFirst = true;
            while (rs.next()) {
                if (!isFirst) json.append(",");
                json.append("{")
                    .append("\"bno\":").append(rs.getInt("BNO")).append(",")
                    .append("\"animeTitle\":\"").append(escapeJson(rs.getString("ANIME_TITLE"))).append("\",")
                    .append("\"title\":\"").append(escapeJson(rs.getString("TITLE"))).append("\",")
                    .append("\"rating\":").append(rs.getInt("RATING")).append(",")
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

    // POST: アニメレビュー登録
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession(false);
        String writer = (session != null) ? (String) session.getAttribute("loginId") : null;

        if (writer == null) {
            response.sendRedirect(request.getContextPath() + "/login.html");
            return;
        }

        String animeTitle = request.getParameter("animeTitle");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        int rating = 5;
        try {
            rating = Integer.parseInt(request.getParameter("rating"));
        } catch (NumberFormatException ignored) {}

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DBConn.getConnection();
            String sql = "INSERT INTO ANIME_REVIEWS (BNO, ANIME_TITLE, TITLE, CONTENT, RATING, WRITER, REG_DATE) " +
                         "VALUES (SEQ_REVIEW_BNO.NEXTVAL, ?, ?, ?, ?, ?, SYSDATE)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, animeTitle);
            pstmt.setString(2, title);
            pstmt.setString(3, content);
            pstmt.setInt(4, rating);
            pstmt.setString(5, writer);
            pstmt.executeUpdate();

            response.sendRedirect(request.getContextPath() + "/board.html");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/board.html?error=save");
        } finally {
            DBConn.close(pstmt, conn);
        }
    }

    private String escapeJson(String val) {
        if (val == null) return "";
        return val.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}