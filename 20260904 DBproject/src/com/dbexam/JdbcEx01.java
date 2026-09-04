package com.dbexam;
/* JDBC를 이용한 데이터베이스 연결 방법
 * 
 * 1단계: import java.sql.*;
 * 
 * 2단계: 특정 DRIVER 검색
 *           ms.access, mysql, mssql, oracle
 *           
 *           oracle.jdbc.driver.OracleDriver
 * 
 * 3단계: DB연결
 *           Connection con = 
 *           DriverManager.getConnection(url, id, password)
 *           
 *           url: jdbc:oracle:thin:@localhost:1521:orcl
 *           id: scott 
 *           password: tiger
 * 
 * 4단계: Query문 작성
 *          정적: Statement
 *             Statement stmt = con.createStatement();
 *          
 *          
 *          동적: PreparedStatement
 *              PreparedStatement = con.PrepareStatement();
 * 
 * 5단계: 결과 저장
 *      ResulSet rs = stmt.executeQuery(query);
 *           - Query문이 select인 경우(검색)
 *           
 *      ResulSet rs = stmt.executeUpdateQuery(query);
 *           - Query문이 insert, update, delete인 경우(삽입, 수정, 삭제)
 *           
 *      ResulSet rs = pstmt.executeQuery(query);
 *           
 *      ResulSet rs = pstmt.executeUpdateQuery(query);     
 *           
 * 6단계: 사용후 데이터 베이스 연결해제 -> close();
 */
import java.sql.*; // 이게 없으면 코드들에게 에러가 발생
public class JdbcEx01 {

	// 데이터 추가
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			// jdbc 드라이브 검색
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("드라이버 검색 연결 성공");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", // 공백도 인식하니 주의!!
					"scott",
					"tiger");
			
			//System.out.println("데이터 베이스 연결 성공");
			
			// Statement 객체 생성
			stmt = con.createStatement(); 
			
			//SQL문 작성
			
			// 데이터 추가
			// 학과번호: 203, 학과이름: 제어계측학과 
			//단과대 번호:200, loc: "7호관"
			String sql="insert into department "
					+ "values(203, '제어계측학과', 200, '7호관')"; 
			
			// Query문 실행
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개 행이 추가 되었습니다.");
			
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}finally {// 사용 후 데이터 베이스 연결 해제
			try {
				if(stmt !=null) stmt.close();
			}catch(SQLException ss){
				ss.printStackTrace();
			}
		} try {
			if(stmt !=null) stmt.close();
		}catch(SQLException ss){
			ss.printStackTrace();
		}
				
}}

// 만약 한번 더 실행하면 에러가 난다.
// 그 이유는 똑같은 번호가 또 들어면 제약 조건에 위배되게 때문이다 
