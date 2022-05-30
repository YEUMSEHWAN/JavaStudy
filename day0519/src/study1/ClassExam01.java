package study1;
import java.io.*;

import study.ClassExam;
public class ClassExam01 {

	public static void main(String[] args)throws IOException {
		
		
		ClassExam ce = new ClassExam();
		//값 입력
		ce.setX();
		ce.setY();
		
		//결과 출력
		ce.display();
		
		//좌표이동
		ce.setX();
		ce.setY();
		
		//다시 결고 출력
		ce.display();
		
		
	}

}
