package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet", urlPatterns = { "/Hello", "/bb", "/xxx" }) // : �̳����̼��� �̿��ϴ� ��� : ���θ�
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		
		System.out.println("init ��û.");
	}
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("HelloServlet ��û.");
	}
	
	@Override
	public void destroy() {
	
	System.out.println("destroy ��û.");
	
	}
}
