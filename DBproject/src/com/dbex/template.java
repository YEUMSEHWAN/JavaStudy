package com.dbex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class template {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();

		sql.append("update department ");
		sql.append("set dname='��ǻ�Ͱ��а�' ");
		sql.append("where deptno=203 ");

		Connection con = null;
		Statement stmt = null;

		try {
			// jdbc ����̺� �޸𸮿� �ε��ϱ�
			Class.forName("oracle.jdbc.driver.OracleDriver");// �� ����ϱ�.
			// ���ᰴü ���
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			// System.out.println("�����ͺ��̽� ���� ����");(����Ǿ����� Ȯ����)

			//DB����
			stmt = con.createStatement();
			
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "���� ���� �߰��Ǿ����ϴ�.");

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
