package Score;

/*
 *국어 영어 수학 점수입력(공백 구분) 10 20 30
 *2번째 학생의 학번 이름 입력(공백 구분) : 2222 김유신
 *국어 영어 수학 점수입력(공백구분 10 20 30 
 *
 * 학번 이름 국어 영어 수학 총점 평균 수우미양가
 * 
 * Record
 * 
 * String name
 * String[]score = new String[3] 과목
 * int[] sco = new int[3] 과목점수
 * int number,avg,sum
 * 
 * 인터페이스 : Sung
 * set();
 * input();
 * print();
 * 
 * 인터페이스를 구현할 클래스 정의
 * Sunglmpl
 * 
 */

public class Record {// 속성만 존재하는 클래스

	String name;
	String[] score = new String[3];// (국,영,수) 수 우 미 양 가
	int[] sco = new int[3];// 과목점수 [0]국,[1]영,[2]수
	int number, avg, sum;

}
