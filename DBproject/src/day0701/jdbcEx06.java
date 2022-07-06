package day0701;

import java.sql.*;

public class jdbcEx06 {
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();

		sql.append("update professor ");
		sql.append("set sal = ? ");
		sql.append("where name = ? ");

		/*
		 * sql.append("insert into professor");
		 * sql.append("values(9920,'홍길동','gildonghong','전임교수',250,sysdate,32,203)");
		 */
		Connection con = null;
		PreparedStatement pstmt = null;// 동적객체 생성

		try {

			// 데이터 베이스 연결
			con = ConnUntil.getConnection();
			System.out.println("데이터베이스 연결 성공");
			pstmt = con.prepareStatement(sql.toString());
			// 쿼리의 파라미터 세팅
			// 쿼리의 ? (바인딩 변수)에 대체될 실체값을 지정함
			pstmt.setInt(1, 500);// 교수번호
			pstmt.setString(2, "홍길동");// 이름

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
