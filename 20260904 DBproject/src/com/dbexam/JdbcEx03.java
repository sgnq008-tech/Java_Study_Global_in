package com.dbexam;
// 데이터 삭제

import java.sql.*;
public class JdbcEx03 {
	
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
			String sql="delete from department " // from은 생략 가능
					+ "where dname='컴퓨터 공학과' ";
					
			// Query문 실행
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개 행이 삭제 되었습니다.");
			
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
				
}
		
	}


