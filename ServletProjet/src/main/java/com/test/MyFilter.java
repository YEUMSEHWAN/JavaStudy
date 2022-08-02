package com.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = { "/*" })
public class MyFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("My Filter....");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("MyFilter ��û ���� �ڵ� �۾�....");
		// �ѱ� ó�� �۾�
		request.setCharacterEncoding("utf-8");

		chain.doFilter(request, response);
		System.out.println("MyFilter ��û ���� �ڵ� �۾�....");
	}

	@Override
	public void init(FilterConfig fconfig) throws ServletException {
		System.out.println("My Filter �ʱ�ȭ....");
	}

}
