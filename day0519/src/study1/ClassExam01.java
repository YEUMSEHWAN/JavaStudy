package study1;
import java.io.*;

import study.ClassExam;
public class ClassExam01 {

	public static void main(String[] args)throws IOException {
		
		
		ClassExam ce = new ClassExam();
		//�� �Է�
		ce.setX();
		ce.setY();
		
		//��� ���
		ce.display();
		
		//��ǥ�̵�
		ce.setX();
		ce.setY();
		
		//�ٽ� ��� ���
		ce.display();
		
		
	}

}
