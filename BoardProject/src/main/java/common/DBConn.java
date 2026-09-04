package common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // 오라클 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            
            // orcl 접속 URL (환경에 따라 /orcl 또는 :orcl 적용)
            String url = "jdbc:oracle:thin:@localhost:1521/orcl"; 

            // SQL Developer 접속 계정 및 비밀번호
            String id = "scott"; // 실제 SQL Developer 계정명으로 설정
            String pw = "tiger";          // 해당 계정의 비밀번호로 설정

            conn = DriverManager.getConnection(url, id, pw);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(AutoCloseable... resources) {
        for (AutoCloseable res : resources) {
            if (res != null) {
                try {
                    res.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}