package com.dbex;

import java.sql.*;
/*
 *   JDBC(Java DataBase Connection)�� �̿��� �����ͺ��̽� ���� ���
 *   
 *   �� 6�ܰ�� �̷���� �ִ�.
 *   
 *   1�ܰ�
 *    - import java.sql.*;
 *   
 *   2�ܰ�
 *    - Driver �˻� �ܰ�
 *      oracle : oracle.jdbc.driver.OracleDriver
 *      
 *   3�ܰ�
 *    - DataBase ����
 *      Connection con = DriverManager.getConnection(url,id,password);
 *      
 *      	oracle url --> jdbc:oracle:thin:@localhost:1521:SID(orcl)
 *      				ID : ����Ŭ ����� ����
 *      				Password : ����Ŭ ����� ������ ��й�ȣ
 *      
 *   -------------------������ �ؾ��Ѵ�.----------------------------------------
 *   
 *   4�ܰ�
 *    - ������ �ۼ�
 *    
 *    ����
 *    	Statement Class(����) //���� ������ �ִ°�
 *     	- Statement stmt = con.createStatement();
 *     
 *    ����
 * 	  	PreparedStatement (����) //�׶��׶����� ���� �ٸ�
 * 	  	- PreparedStatement pstmt = con.prepareStatement(������);
 *    
 *    5�ܰ� : ���� ��� ����
 *    	(����)
 *    	ResultSet rs = stmt.executeQuery(query);// select
 *    	ResultSet rs = stmt.executeUpdate(query);// insert,update,delete
 *    
 *    	(����) 
 *    	ResultSet rs = pstmt.executeQuery(query);// select
 *    	ResultSet rs = pstmt.executeUpdate(query);// insert,update,delete
 *    
 *  ----------------6�ܰ�� ������ ����-------------------------------------  
 *    6�ܰ�
 *    	-��� �� �ݵ�� close() �޼ҵ带 �����Ѵ�.
 *    	 ���� ����
 * 		 
 * 
 */
public class jdbcEx01 {

	public static void main(String[] args) {
		// DB ���� ��ü ����
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
			StringBuffer sql = new StringBuffer();

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
