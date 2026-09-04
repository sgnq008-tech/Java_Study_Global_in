package com.dbexam;

import java.sql.*;

public class JdbcEx07 {

	public static void main(String[] args) {
        String sql = "select a.name, a.profno, a.position, b.dname "
        		+ "from professor a, department b " // 만약 끝에 띄어쓰기를 넣지 않으면 단어가 합쳐진다.
        		+ "where a.deptno=b.deptno and a.deptno=?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = ConnUtil.getConnection();
		
		//PreparedStatement 객체 생성
		pstmt = con.prepareStatement(sql);
		
		// 파라미터 설정
		// 쿼리의 바인딩변수(?)에 대체될 실제값을 지정하기
		pstmt.setInt(1, 203);
		// 쿼리문 실행
		 rs = pstmt.executeQuery();
		 
		 // rs에서 값 데이터 추출 
		 while(rs.next()) {
			 System.out.print(rs.getString("name")+"\t");
			 System.out.print(rs.getString("profno")+"\t");
			 System.out.print(rs.getString("dname")+"\t"); // 띄어쓰기 수정하고 싶은 \t만 없애주면 된다/
			 System.out.print(rs.getString("position"));
		 }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null) rs.close();
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

