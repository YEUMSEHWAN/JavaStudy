package study;

public class ArrayEx02 {

	public static void main(String[] args) {

		int aa[][] = new int[5][5];
		int n = 1;

		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				aa[i][j] = n;
				n++;

				System.out.printf("%2d", aa[i][j]);
			}
			System.out.println();
			n = i + 2;
		}

	}

}
