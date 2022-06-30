package com.dbex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEx03delete {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();

		sql.append("delete from department ");
		sql.append("where dname='컴퓨터공학과' ");

		Connection con = null;
		Statement stmt = null;

		try {
			// jdbc 드라이브 메모리에 로드하기
			Class.forName("oracle.jdbc.driver.OracleDriver");// 꼭 기억하기.
			// 연결객체 얻기
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			// System.out.println("데이터베이스 연결 성공");(연결되었는지 확인차)

			//DB연결
			stmt = con.createStatement();
			
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "개의 행이 삭제되었습니다.");

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {if (stmt != null)stmt.close();} catch (SQLException s) {}
			try {if (con != null)con.close();} catch (SQLException s) {

			}
		}

		
		
	}

}
