package study;


/*		클래스명의 첫 글자는 대문자로
 *		자바 프로그램 시작할때 class, main()을 기본적으로 입력.
 *		
 *		main() 메소드 안에 소스코드를 작성하여 클래스 이름과 동일한 파일명으로 저장함
 *		확장자는  ~  .java
 *
 */
import java.util.Scanner;

public class Test001 {
	//main(): 메인 메소드
	

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("임의의 정수 입력 :");
	//안내메세지
	//int a = 10;
	int a =Integer.parseInt(sc.next());
	//임의의 수를 입력받아 정수형으로 파싱하시오.
	System.out.print(a);	


}
}