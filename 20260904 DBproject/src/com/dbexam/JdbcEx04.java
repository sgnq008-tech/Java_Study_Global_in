package com.dbexam;
// 데이터 검색(정적)

import java.sql.*;
public class JdbcEx04 {
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		
		/*select Query의 수행 결과를 결과 집합에서 데이터를 
		 * 추출할 수 있는 메소드를 가지고 있는 객체
		 */
		ResultSet rs = null;
		
		
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
			String sql="select deptno, dname, college, loc "
					+ "from department";
					
			// Query문 실행
			/*실행하고자 하는 SQL이 select 쿼리인 경우
			 * Query 실행 결과 집합을 리턴 받을 수 있는 
			 * executeQuery() 메소드를 사용한다.
			 */
			rs = stmt.executeQuery(sql);
			/*resultSet 객체로부터 데이터를 추출함
			 *  resultset의 next() 메소드는 커서를 다음행으로
			 *  이동시킨다.
			 *  이동되는 위치에 행이 존재하면 true,
			 *  행이 존재하지 않으면 false를 반한한다.
			 *  
			 *  rs.next()가 참인동안 데이터를 추출함
			 */
			while(rs.next()) {
				/* 커서가 위치한 행을 각 컬럼에서 값을 추출 
				 * resultset의 getXXX(컬럼위치), getXXX(컬럼이름)메소드
				 * 를 사용해서 컬럼에 데이터를 추출함
				 */
				int i= rs.getInt(1); //rs.getInt("deptno"); 로 대신 넣을 수 있음
				String s1 = rs.getString(2);
				int j = rs.getInt("college");
				String s2 = rs.getString("loc");
				System.out.println(i+"\t"+s1+"\t"+j+"\t"+s2);
			}
			
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}finally {// 사용 후 데이터 베이스 연결 해제
			try {
				if(rs !=null) rs.close();
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


