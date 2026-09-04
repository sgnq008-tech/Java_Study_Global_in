package Board;

import java.sql.*;
import java.util.Scanner;

public class SimpleBoard {
    // 본인의 MySQL 비밀번호와 DB 이름으로 수정하세요.
    static final String URL = "jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==================================");
            System.out.println("  1. 목록보기  2. 글쓰기  3. 글삭제  0. 종료");
            System.out.println("==================================");
            System.out.print("메뉴 선택 >> ");
            int menu = sc.nextInt();
            sc.nextLine(); // 숫자 입력 후 남은 엔터키 제거

            if (menu == 1) {
                // 1. 목록 조회
                showList();
            } else if (menu == 2) {
                // 2. 글 작성
                System.out.print("제목: ");
                String title = sc.nextLine();
                System.out.print("작성자: ");
                String writer = sc.nextLine();
                System.out.print("내용: ");
                String content = sc.nextLine();
                
                writePost(title, writer, content);
            } else if (menu == 3) {
                // 3. 글 삭제
                System.out.print("삭제할 글 번호: ");
                int id = sc.nextInt();
                
                deletePost(id);
            } else if (menu == 0) {
                System.out.println("게시판을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
            }
        }
        sc.close();
    }

    // [조회 기능] SELECT
    public static void showList() {
        String sql = "SELECT * FROM simple_board ORDER BY id DESC";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("\n[글번호 | 제목 | 작성자 | 내용]");
            System.out.println("----------------------------------------");
            
            boolean hasData = false;
            while (rs.next()) {
                hasData = true;
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String content = rs.getString("content");

                System.out.println(id + " | " + title + " | " + writer + " | " + content);
            }

            if (!hasData) {
                System.out.println("등록된 글이 없습니다.");
            }

        } catch (Exception e) {
            System.out.println("조회 중 오류 발생: " + e.getMessage());
        }
    }

    // [작성 기능] INSERT
    public static void writePost(String title, String writer, String content) {
        String sql = "INSERT INTO simple_board (title, writer, content) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, title);
            pstmt.setString(2, writer);
            pstmt.setString(3, content);

            int result = pstmt.executeUpdate();
            if (result > 0) {
                System.out.println("게시글이 등록되었습니다!");
            }

        } catch (Exception e) {
            System.out.println("등록 중 오류 발생: " + e.getMessage());
        }
    }

    // [삭제 기능] DELETE
    public static void deletePost(int id) {
        String sql = "DELETE FROM simple_board WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);

            int result = pstmt.executeUpdate();
            if (result > 0) {
                System.out.println(id + "번 글이 삭제되었습니다.");
            } else {
                System.out.println("해당 번호의 글이 존재하지 않습니다.");
            }

        } catch (Exception e) {
            System.out.println("삭제 중 오류 발생: " + e.getMessage());
        }
    }
}