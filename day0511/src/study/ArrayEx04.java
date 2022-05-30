package study;

public class ArrayEx04 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		// for 문을 이용하여 0~9까지 초기화.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.print(arr[i]);
		}
		System.out.println();
		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10);
			
			int temp = arr[0];
			arr[0] = arr[n];
			arr[n] = temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ "  ");
		}
	}

}
