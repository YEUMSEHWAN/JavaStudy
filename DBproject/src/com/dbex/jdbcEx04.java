package com.dbex;

import java.sql.*;

public class jdbcEx04 {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();

		sql.append("select deptno, dname, college, loc ");
		sql.append("from department ");
		//sql.append("select * ");

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		/*
		 * select ������ ���� ��� ���հ� ������տ��� �����͸�
		 * ������ �� �ִ� �޼ҵ带 ������ �ִ� ��ü�� ResultSet ��ü��. 
		 */
		
		try {
			// jdbc ����̺� �޸𸮿� �ε��ϱ�
			Class.forName("oracle.jdbc.driver.OracleDriver");// �� ����ϱ�.

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			stmt = con.createStatement();
			
			/*
			 * �����ϰ��� �ϴ� sql select �� ���
			 * ���� ������ ��������� ���� ���� �� �ִ�
			 * executeQuery()�� ����Ѵ�.
			 * 
			 */
			rs = stmt.executeQuery(sql.toString());
			
			/*
			 * ResultSet ��ü�� ���� ������ ����
			 * ResultSet �� next() �޼ҵ�� Ŀ���� ���������� �̵���Ŵ.
			 * �̵��� ��ġ�� row(��)�� �����ϸ� true, �������� ������ false�� ��ȯ��.
			 * 
			 * rs.next() �� ���� ����, �� ��� ���տ� ���� �����ϴ� ���� ResultSet���κ��� 
			 * �����͸� ������.
			 *  
			 */
			  while(rs.next()){
					 //Ŀ���� ��ġ�� row�� culumn���� ���� �����ϱ�.
				  	 //resultSet�� getXXX(�÷��� ��ġ),getXXX("�÷� �̸�")
				     //�޼ҵ带 �̿��ؼ� column ���� ������
				  int i = rs.getInt(1);//rs.getInt("deptno")
				  String s1 = rs.getString(2);
				  int j = rs.getInt("college");
				  String s2 = rs.getString("loc");
				  System.out.println(i+"\t"+s1+"\t"+j+"\t"+s2);
					   }
			
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			
			
			
			try {if (rs != null)rs.close();} catch (SQLException s) {}
			try {if (stmt != null)stmt.close();} catch (SQLException s) {}
			try {if (con != null)con.close();} catch (SQLException s) {

			}
		}

	}

}
