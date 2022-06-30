package com.dbex;

import java.sql.*;

public class jdbcEx2 {// update : 학과명 : 컴퓨터공학과 변경 조건 학과번호 = 203

	public static void main(String[] args) {

		StringBuffer sql = new StringBuffer();

		sql.append("");
		sql.append("");
		sql.append("");

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
			try {if (stmt != null)stmt.close();} catch (SQLException s) {}
			try {if (con != null)con.close();} catch (SQLException s) {}
		}

	}

}
