package study;
/*문]
 * -1^2 +2^2 -3^2 +4^2 -5^2 +.......+100^2의 합계를 구하는 프로그램을 작성하시오.
 */
public class WhileExam03 {

	public static void main(String[] args) {

		int i=1,simbol=1,sum=0;
		
		while(i<=100) {
			
			sum+= i;
			i++;
		}
		System.out.println(sum);	
		
		
	}
	}

