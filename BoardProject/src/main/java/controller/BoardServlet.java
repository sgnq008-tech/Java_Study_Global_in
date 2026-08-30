package controller;

import java.io.IOException;
import java.io.PrintWriter;
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

    // 게시글 목록 조회
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String sql = "SELECT BNO, TITLE, WRITER, TO_CHAR(REG_DATE, 'YYYY-MM-DD HH24:MI') AS REG_DATE "
                   + "FROM BOARD ORDER BY BNO DESC";

        StringBuilder json = new StringBuilder("[");

        try (Connection conn = DBConn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            boolean first = true;
            while (rs.next()) {
                if (!first) {
                    json.append(",");
                }
                json.append("{")
                    .append("\"bno\":").append(rs.getInt("BNO")).append(",")
                    .append("\"title\":\"").append(escapeJson(rs.getString("TITLE"))).append("\",")
                    .append("\"writer\":\"").append(escapeJson(rs.getString("WRITER"))).append("\",")
                    .append("\"regDate\":\"").append(rs.getString("REG_DATE")).append("\"")
                    .append("}");
                first = false;
            }
            json.append("]");
            out.print(json.toString());

        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            out.print("[]");
        }
    }

    // 게시글 작성 등록
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession(false);
        String writer = (session != null) ? (String) session.getAttribute("userId") : null;

        if (writer == null) {
            response.sendRedirect(request.getContextPath() + "/login.html");
            return;
        }

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        String sql = "INSERT INTO BOARD (BNO, TITLE, CONTENT, WRITER, REG_DATE) "
                   + "VALUES (SEQ_BOARD_BNO.NEXTVAL, ?, ?, ?, SYSDATE)";

        try (Connection conn = DBConn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setString(3, writer);

            int result = pstmt.executeUpdate();

            if (result > 0) {
                response.sendRedirect(request.getContextPath() + "/board.html");
            } else {
                response.sendRedirect(request.getContextPath() + "/write.html?error=fail");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/write.html?error=exception");
        }
    }

    private String escapeJson(String value) {
        if (value == null) return "";
        return value.replace("\\", "\\\\")
                    .replace("\"", "\\\"")
                    .replace("\n", "\\n")
                    .replace("\r", "\\r");
    }
}