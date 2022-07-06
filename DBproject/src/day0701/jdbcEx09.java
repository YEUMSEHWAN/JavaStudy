package day0701;

import java.sql.*;
import java.io.*;
import java.util.*;

public class jdbcEx09 {

	public static void main(String[] args) throws IOException {

		Properties pro = new Properties();
		pro.load(new FileInputStream("src/department.properties"));

		StringBuffer sql = new StringBuffer();

		Connection con = null;
		PreparedStatement pstmt = null;// 동적객체 생성

		try {

			// 데이터 베이스 연결
			con = ConnUntil.getConnection();
			/*
			 * department.properties에 정의된 sql을 가져와서 preparedStreament 만듬
			 * 
			 * 
			 * 
			 */
			System.out.println("데이터베이스 연결 성공");
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));

			// 쿼리의 파라미터 세팅
			// 쿼리의 ? (바인딩 변수)에 대체될 실체값을 지정함
			pstmt.setInt(1, 100);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5호관");// 위치

			// 쿼리 실행
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이 추가되었습니다.");

		} catch (SQLException ss) {
			ss.printStackTrace();
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException s) {
				s.printStackTrace();
			}

			try {
				if (con != null)
					con.close();
			} catch (SQLException s) {
				s.printStackTrace();
			}

		}

	}

}
