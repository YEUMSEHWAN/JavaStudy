package com.bbs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login/Login") // �Ƴ����̼� ����� Ȱ��
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");

		// System.out.println("���̵� : " + userid + ", ��й�ȣ : " + passwd);

		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("���̵� : " + userid + "<br>");
		out.println("��й�ȣ : " + passwd + "<br>");
		out.println("</body>");
		out.println("</html>");
	}

}
