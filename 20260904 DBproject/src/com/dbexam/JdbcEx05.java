package com.dbexam;
//데이터 검색(동적)

/*
 * PreparedStatement는 sql의 형태는 동일하나 조건이나
 * 변수값이 다른 문장을 바인딩 변수를 사용해서 변수를 처리함으로써
 * 항상 동일한 sql문을 동일하게 처리하게 할 수 있다.
 * 
 *  
 * PreparedStatement 객체의 생성 및 바인딩 변수 사용
 * 
 * 바인딩 변수는 실제 값으로 대체될 부분에 사용한다.
 *                                                                  ?는 바인딩
 *  String sql = "insert into department values(?,?,?,?)";
 *  PreparedStatement pstmt = conpreparedStatement(sql);
 */

/*
 *  바인딩 변수의 개수만큼 순서대로 해당 변수에 대체될 값을 지정해준다.
 *  pstmt.setInt(1, 203):
 *  pstmt.setString(2, "생명공학과"):
 *  pstmt.setInt(3, 200):
 *  pstmt.setString(4, "6호관");
 *  
 *  PreparedStatement 객체는 PreparedStatement의 
 *  바인딩변수에 값을 지정해주는 setXXX() 메소드를 제공해준다.
 */

// 현재 수정한 내용을 바로 반영해서 저장하는 것 

//게시판을 만들떄 동적으로 만들어야함
import java.sql.*;
public class JdbcEx05 {// 바인딩으로 데이터 추가
	
	public static void main(String[] args) {
		/* PreparedStatement를 사용하는 경우
		 *    sql Query에서 실제값으로 대체될 부분을 ?로 처리한다.
		 *    ?는 DB에서 sql실행시에 실제값으로 대체된다. 
		 */
		String sql = "insert into professor "
				+ "values(?,?,?,?,?,sysdate,?,?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnUtil.getConnection();
		
		//PreparedStatement 객체 생성
		pstmt = con.prepareStatement(sql);
		
		// 파라미터 설정
		// 쿼리의 바인딩변수(?)에 대체될 실제값을 지정하기
		pstmt.setInt(1, 9920);
		pstmt.setNString(2, "홍길동");
		pstmt.setNString(3, "GilDongHong");
		pstmt.setNString(4, "전임교수");
		pstmt.setInt(5, 450);
		pstmt.setInt(6, 40);
		pstmt.setInt(7, 203);
		// 쿼리 실행
		// 쿼리문 실행
		int result = pstmt.executeUpdate();
		System.out.println(result+"개 행이 추가 되었습니다.");
			
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

