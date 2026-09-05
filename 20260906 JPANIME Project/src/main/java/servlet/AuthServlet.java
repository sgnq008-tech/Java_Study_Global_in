package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/api/auth")
public class AuthServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // GET: ログイン中のユーザー名を文字列で返却
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/plain; charset=UTF-8");
        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("loginName") != null) {
            response.getWriter().write((String) session.getAttribute("loginName"));
        } else {
            response.getWriter().write("");
        }
    }

    // POST: ログアウト処理（セッション無効化）
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        response.sendRedirect(request.getContextPath() + "/login.html");
    }
}