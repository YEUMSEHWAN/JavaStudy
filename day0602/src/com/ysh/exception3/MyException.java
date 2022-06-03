package com.ysh.exception3;

import java.io.PrintStream;
import java.io.PrintWriter;

public class MyException extends Exception {

	private String message; // ���� ������ �����ϴ� ��������

	private Throwable cause;// ���� ������ Throwable ��ü�� ���·� ���� �ϰڴ�.
	// Throwable : �����ϰ� ���� ��θ� ����.
	// Throwable�� �����ϰ� ���� ��θ� ����(Exception �� Error Ŭ������ �θ� Ŭ����

	public MyException() {
		super();

	}

	public MyException(String msg) {
		super(msg);
		message = msg;
	}

	public MyException(Throwable cause) {
		super(cause);
		this.cause = cause;
	}

	public MyException(String msg, Throwable cause) {
		super(msg, cause);
		this.message = message;
		this.cause = cause;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}

	public void printStackTrace() {
		System.out.println("::Error �߻�...");
		System.out.println("���� ���� : " + message);
		System.out.println("���� Ŭ���� : " + cause);
		System.out.println("::Error ���� ��...");

		super.printStackTrace(System.out);

	}

	public void printStackTrace(PrintStream out) {
		super.printStackTrace(out);
	}

	public void printStackTrace(PrintWriter out) {
		super.printStackTrace(out);
	}
}
