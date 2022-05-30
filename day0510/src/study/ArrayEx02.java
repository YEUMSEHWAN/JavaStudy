package study;

public class ArrayEx02 {

	public static void main(String[] ar) {

		for (String s : ar)
			System.out.printf("%3s", s);
		System.out.println();

		String[] subject = { "국어점수", "영어점수", "수학점수" };

		for (String ss : subject)
			System.out.printf("%3s\n", ss);

		System.out.println();
		// char ch[] = new char[4];
		char ch[] = { 'J', 'A', 'V', 'A' };
		char cha[] = new char[] { 'J', 'A', 'V', 'A' };
		char cha1[] = new char[] { 'J', 'A', 'V', 'A' };

		for (int i = 0; i < ch.length; i++) {
			System.out.println("ch[" + i + "]:" + ch[i]);
		}
		System.out.println();
		for (int i = 0; i < cha1.length; i++) {
			System.out.println("cha[" + i + "]:" + cha[i]);
		}
		System.out.println();
		for (int i = 0; i < cha1.length; i++) {
			System.out.println("cha1[" + i + "]:" + cha1[i]);
		}

	}

}
