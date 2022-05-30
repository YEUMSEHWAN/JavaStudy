package ArrayTest;
import java.util.*;
public class ArrayTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int unit[] = {50000,10000,1000,500,100,50,10,1};
		
		System.out.printf("금액 : ");
		int money = sc.nextInt();


		
			for(int i = 0;i<unit.length;i++) {
				//동전 개수 계산
				int res = money/unit[i];
				//res 몫이 있는 경우
				if(res>0) {
					System.out.println(unit[i]+"원 짜리 : "+res+"개");
					money = money%unit[i];//money 갱신
				}
			}
		
	}

}
