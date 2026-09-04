package com.dbexam;

import java.sql.*;
import java.util.*;
import java.io.*;

public class JdbcEX09 {

	public static void main(String[] args) throws IOException{
		
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/department.properties"));
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnUtil.getConnection();
		
		//PreparedStatement 객체 생성
		pstmt = con.prepareStatement(pro.getProperty("department_insert"));
		
		// 파라미터 설정
		// 쿼리의 바인딩변수(?)에 대체될 실제값을 지정하기
		pstmt.setInt(1, 100);
		pstmt.setString(2, "산업공학과");
		pstmt.setInt(3, 200);
		pstmt.setString(4, "5호관");
		
		int result = pstmt.executeUpdate();
		System.out.println(result+"개의 행이 추가 되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(pstmt !=null) pstmt.close();
			}catch(SQLException ss){
				ss.printStackTrace();
			}
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

