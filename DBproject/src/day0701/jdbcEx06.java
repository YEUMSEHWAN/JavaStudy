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
		 * sql.append("values(9920,'ȫ�浿','gildonghong','���ӱ���',250,sysdate,32,203)");
		 */
		Connection con = null;
		PreparedStatement pstmt = null;// ������ü ����

		try {

			// ������ ���̽� ����
			con = ConnUntil.getConnection();
			System.out.println("�����ͺ��̽� ���� ����");
			pstmt = con.prepareStatement(sql.toString());
			// ������ �Ķ���� ����
			// ������ ? (���ε� ����)�� ��ü�� ��ü���� ������
			pstmt.setInt(1, 500);// ������ȣ
			pstmt.setString(2, "ȫ�浿");// �̸�

			// ���� ����
			int i = pstmt.executeUpdate();
			System.out.println(i + "�� ���� �߰��Ǿ����ϴ�.");

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
