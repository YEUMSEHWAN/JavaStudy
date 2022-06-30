package com.dbex;

import java.sql.*;
/*
 *   JDBC(Java DataBase Connection)를 이용한 데이터베이스 연결 방법
 *   
 *   총 6단계로 이루어져 있다.
 *   
 *   1단계
 *    - import java.sql.*;
 *   
 *   2단계
 *    - Driver 검색 단계
 *      oracle : oracle.jdbc.driver.OracleDriver
 *      
 *   3단계
 *    - DataBase 연결
 *      Connection con = DriverManager.getConnection(url,id,password);
 *      
 *      	oracle url --> jdbc:oracle:thin:@localhost:1521:SID(orcl)
 *      				ID : 오라클 사용자 계정
 *      				Password : 오라클 사용자 계정의 비밀번호
 *      
 *   -------------------무조건 해야한다.----------------------------------------
 *   
 *   4단계
 *    - 쿼리문 작성
 *    
 *    정적
 *    	Statement Class(정적) //값이 정해져 있는것
 *     	- Statement stmt = con.createStatement();
 *     
 *    동적
 * 	  	PreparedStatement (동적) //그때그때마다 값이 다름
 * 	  	- PreparedStatement pstmt = con.prepareStatement(쿼리문);
 *    
 *    5단계 : 쿼리 결과 저장
 *    	(정적)
 *    	ResultSet rs = stmt.executeQuery(query);// select
 *    	ResultSet rs = stmt.executeUpdate(query);// insert,update,delete
 *    
 *    	(동적) 
 *    	ResultSet rs = pstmt.executeQuery(query);// select
 *    	ResultSet rs = pstmt.executeUpdate(query);// insert,update,delete
 *    
 *  ----------------6단계는 무조건 실행-------------------------------------  
 *    6단계
 *    	-사용 후 반드시 close() 메소드를 실행한다.
 *    	 연결 해제
 * 		 
 * 
 */
public class jdbcEx01 {

	public static void main(String[] args) {
		// DB 연결 객체 선언
		Connection con = null;
		Statement stmt = null;

		try {
			// jdbc 드라이브 메모리에 로드하기
			Class.forName("oracle.jdbc.driver.OracleDriver");// 꼭 기억하기.
			// 연결객체 얻기
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			// System.out.println("데이터베이스 연결 성공");(연결되었는지 확인차)

			// Statement 객체 얻기
			stmt = con.createStatement();
			// sql 쿼리문 작성
			StringBuffer sql = new StringBuffer();

			sql.append("insert into department ");
			sql.append("values(203,'제어계측공학과',200,'7호관')");
			// 쿼리문 실행
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "개의 행이 추가되었습니다.");

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException s) {
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException s) {

			}
		}

	}

}
