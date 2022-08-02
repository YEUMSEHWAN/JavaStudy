package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/InitParam")
public class InitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String company;
	private String manager;
	private String tel;
	private String email;


	public void init() throws ServletException {
		System.out.println("�ʱ�ȭ �޼ҵ� ������");

		/*
		 * servletContext servletContext ��ü�� web application�� �ϳ��� �����Ǵ� ��ü�̴�. web
		 * application ��ü���� �����Ҽ� �ִ� �ʱ� �Ķ���� ���� ����(���������� ����) Servlet������
		 * getServletContext()�� �̿��Ͽ� ServletContext ��ü�� �����ü� �ִ�.
		 */

		// servletContext�� �ʱ� �Ķ���� �� �б�
		company = getServletContext().getInitParameter("company");
		manager = getServletContext().getInitParameter("manager");

		// ServletConfig�� �ʱ� �Ķ���� �� ���

		/*
		 * ServletConfig ServletConfig ��ü�� Container�� ������ �����Ҷ� �����Ǵ� ��ü�̴�. DD(web.xml)��
		 * �о �̸�/���� ������ �� �ʱ�ȭ �Ķ���͸� �о ������. ServletConfig ��ü�� Servlet ��ü�� �Ѱ��� �����Ѵ�.
		 * Servlet������ getServletConfig()�� �̿��Ͽ� Servlet�� ���õ� ServletConfig�� ��ü�� ������ �ִ�.
		 * 
		 */

		tel = getServletConfig().getInitParameter("tel");
		email = getServletConfig().getInitParameter("email");
	}

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
			response.setContentType("text/html;charset=UTF-8");
			out.println("<html>");
			out.println("<body>");

			out.println("<li>ȸ��� : " + company + "</li>");
			out.println("<li>����� : " + manager + "</li>");
			out.println("<li>��ȭ��ȣ : " + tel + "</li>");
			out.println("<li>�̸��� : " + email + "</li>");

			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}

}
