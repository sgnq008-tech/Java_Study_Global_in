package com.dbexam;

import java.sql.*;

public class JdbcEX06 {

	public static void main(String[] args) {
		String sql = "update professor set sal =? where name=?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnUtil.getConnection();
		
		//PreparedStatement 객체 생성
		pstmt = con.prepareStatement(sql);
		
		// 파라미터 설정
		// 쿼리의 바인딩변수(?)에 대체될 실제값을 지정하기
		pstmt.setInt(1, 500);
		pstmt.setNString(2, "홍길동");
		// 쿼리 실행
		// 쿼리문 실행
		int result = pstmt.executeUpdate();
		System.out.println(result+"개 행이 수정 되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt !=null) pstmt.close();
			}catch(SQLException ss){
				ss.printStackTrace();
			}
		} try {
			if(con !=null) con.close();
		}catch(SQLException ss){
			ss.printStackTrace();
		}
		   	
		}

	}


