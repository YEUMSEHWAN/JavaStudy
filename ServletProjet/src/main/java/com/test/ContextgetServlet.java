package com.test;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Contextget")
public class ContextgetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �Ӽ��� ������
		String name = (String) getServletContext().getAttribute("name");
		int age = (Integer) getServletContext().getAttribute("age");

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");

		out.print("�̸� : " + name + "<br>");
		out.print("���� : " + age + "<br>");

		out.print("</body>");
		out.print("</html>");

	}

}
