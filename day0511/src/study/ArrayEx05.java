package study;

public class ArrayEx05 {

	public static void main(String[] args) {
		//정수 45개의 값을 저장 배열 생성
		int []lot = new int[45];
		
		for(int i = 0;i<lot.length;i++) {
			lot[i]= i+1;
		}
		int temp =0;
		int j=0;
		
		for(int i=0;i<6;i++) {
			j =(int) (Math.random()*45);//0~44까지의 범위
			
			temp = lot[i];
			lot[i] = lot[j];
			lot[j] = temp;
			
		}
		//출력 값
		for(int i=0;i<6;i++) {
			System.out.printf("lot[%d} : %d\n",i,lot[i]);
		}
	}

}
