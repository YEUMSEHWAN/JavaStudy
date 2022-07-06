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
		PreparedStatement pstmt = null;// ������ü ����

		try {

			// ������ ���̽� ����
			con = ConnUntil.getConnection();
			/*
			 * department.properties�� ���ǵ� sql�� �����ͼ� preparedStreament ����
			 * 
			 * 
			 * 
			 */
			System.out.println("�����ͺ��̽� ���� ����");
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));

			// ������ �Ķ���� ����
			// ������ ? (���ε� ����)�� ��ü�� ��ü���� ������
			pstmt.setInt(1, 100);
			pstmt.setString(2, "������а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5ȣ��");// ��ġ

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
