package ArrayTest;

/*
 *��]
 *���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� �����߿���3�� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.*;

public class ArrayTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf((i+1)+"ù��° ���� ���� : ");
			arr[i] = sc.nextInt();
			
			
		}
		System.out.println();
		System.out.println("3�� ���");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%3==0)
				System.out.println(arr[i]+ "  ");
				
			}
					
	}
}
