package common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {

    // データベース接続取得メソッド
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Oracle JDBC ドライバのロード
            Class.forName("oracle.jdbc.OracleDriver");
            
            // 接続先URL（ポート・SID/サービス名は環境に合わせて変更してください）
            String url = "jdbc:oracle:thin:@localhost:1521/orcl"; 
            String id = "scott"; 
            String pw = "tiger"; 

            // コネクション確立
            conn = DriverManager.getConnection(url, id, pw);
        } catch (Exception e) {
            // 例外ログの出力
            e.printStackTrace();
        }
        return conn;
    }

    // JDBCリソースの安全なクローズ処理
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