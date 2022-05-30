package study;
/*문]
 *  1~100까지의 정수 중에서 2,3,5,7 의 배수를 제외한 수를 한 행에
 * 	10개씩 출력하는 프로그램을 작성하시오.
 */
public class ForExam01 {

	public static void main(String[] args) {
		int i, cnt;
			cnt=1;
		for(i=1; i<=100; i++) {
			if((i % 2!=0) && (i%3!=0) && (i%5!=0) && (i%7!=0))	
				System.out.printf("%3d%c",i, (cnt++ % 7!=0)? ' ' : '\n');
				
				
				
			}
		System.out.println();
		
		}
		
	}


