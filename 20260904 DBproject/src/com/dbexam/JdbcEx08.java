package com.dbexam;
/* transaction 논리적인 작업 단위
 *     insert, update, delete 등의 작업들을 하나의 논리적인 작업 단위로
 *     묶어서 쿼리 실행시 모든 작업이 정상처리된 경우는 commit을 실행해서
 *     데이터 베이스에 반영하고, 쿼리 실행 중 하나라도 정상처리가 되지 않은 경우
 *     rollback을 실행해서 작업 단위내의 모든 작업을 취소함 
 */
import java.sql.*;

import oracle.jdbc.driver.OracleSQLException;

public class JdbcEx08 {

	public static void main(String[] args) {
		String sql1 = "insert into department values(?,?,?,?)";
		 String sql2 = "update department set dname= ?, loc=?, where deptno=?";
			
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
			/////// transacrtion 작업 시작................
			// 하나의 논리적인 작업 단위 시작
			con = ConnUtil.getConnection();
			
			//autoCommit 기능을 비활성화
			// 수동으로 막아두기
			con.setAutoCommit(false);
			
		    /////// 첫번쨰 작업 시작................
			pstmt = con.prepareStatement(sql1);
			pstmt.setInt(1, 255);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9호관");
			pstmt.executeUpdate();
			////////////////// 첫번쨰 작업 끝................
            //////////////////두번쨰 작업 시작................
			
			pstmt = con.prepareStatement(sql2);
			pstmt.setString(1, "생명공학과");
			pstmt.setString(4, "9호관");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
            //////////////////두번쨰 작업 끝................
			// 쿼리가 정상적으로 실행된 경우 데이터 베이스에 반영됨
			
			con.commit();
			System.out.println("DB 작업이 정상적으로 반영되었습니다");
			
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
				try {
					con.rollback();
					System.out.println("DB 작업이 취소 되었습니다");
				}catch(SQLException ee) {
					ee.printStackTrace();
				}
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
			///////transacrtion 작업 끝................	
			}  		   	
		}
}

