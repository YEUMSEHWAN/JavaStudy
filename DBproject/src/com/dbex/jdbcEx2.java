package com.dbex;

import java.sql.*;

public class jdbcEx2 {// update : �а��� : ��ǻ�Ͱ��а� ���� ���� �а���ȣ = 203

	public static void main(String[] args) {

		StringBuffer sql = new StringBuffer();

		sql.append("");
		sql.append("");
		sql.append("");

		Connection con = null;
		Statement stmt = null;

		try {
			// jdbc ����̺� �޸𸮿� �ε��ϱ�
			Class.forName("oracle.jdbc.driver.OracleDriver");// �� ����ϱ�.
			// ���ᰴü ���
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			// System.out.println("�����ͺ��̽� ���� ����");(����Ǿ����� Ȯ����)

			// Statement ��ü ���
			stmt = con.createStatement();
			// sql ������ �ۼ�

			sql.append("insert into department ");
			sql.append("values(203,'����������а�',200,'7ȣ��')");
			// ������ ����
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "���� ���� �߰��Ǿ����ϴ�.");

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
