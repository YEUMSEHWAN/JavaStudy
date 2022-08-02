package com.bbs;

import java.util.*;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VisitList")
public class VisitList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();

		try {
			out.println("<html>");
			out.println("<head><title>���� ����Ʈ</title></head>");

			out.println("<body>");

			StringBuffer sql = new StringBuffer();
			sql.append("select no, writer, memo, regdate ");
			sql.append("from visit ");
			sql.append("order by no desc");

			Connection con = null;
			PreparedStatement pstmt = null;

			ResultSet rs = null;

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

				pstmt = con.prepareStatement(sql.toString());
				rs = pstmt.executeQuery();

				while (rs.next()) {

					int no = rs.getInt("no");
					String writer = rs.getString("writer");
					String memo = rs.getString("memo");
					java.sql.Date regdate = rs.getDate("regdate");

					out.println("<table align = center width = 500 border=1>");
					out.println("<tr>");

					out.println("<th width=50>��ȣ</th>");
					out.println("<td width=50 align = center>" + no + "</td>");

					out.println("<th width = 70>�ۼ���</th>");
					out.println("<td width = 180 align = center>" + writer + "</td>");

					out.println("<th width = 50>��¥</th>");
					out.println("<td width = 100 align = center>" + regdate + "</td>");

					out.println("</tr>");

					out.println("<tr>");
					out.println("<th width = 50>����</th>");
					out.println("<td colspan = 5>&nbsp;");
					out.println("<textarea rows =3 cols =50>" + memo + "</textarea>");

					out.println("</td>");
					out.println("</tr>");

					out.println("</table>");
					out.println("<p>");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null)
						rs.close();
				} catch (SQLException ss) {
				}
			}
			out.println("<p align =center><a href=/ServletProjet/bbs/write.html>�۾���</a><p>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}
}