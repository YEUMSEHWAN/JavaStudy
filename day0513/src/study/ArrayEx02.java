package study;

import java.io.*;

public class ArrayEx02 {

	public static void main(String[] ar) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int human = Integer.parseInt(ar[0]);// ��� �� ���ϱ�
		System.out.println("�л� �� : " + human);

		String[] name = new String[human];
		// String[] subject = new String[ar.length-1];// ����� �ʱ�ȭ
		String[] subject = new String[] { "����", "����", "����" };
		// ������ ���� ó�� �迭 ����
		int[][] jumsu = new int[human][ar.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];

//		for(int i=0;i<ar.length-1;i++) {
//			subject[i] =ar[i+1];
//			System.out.println(subject[i]);
//		}
		for (int i = 0; i < subject.length; i++) {// �л� �� ��ŭ �ݺ�
			System.out.println((i + 1) + "��° �л� �̸� : ");
			name[i] = br.readLine();
			System.out.println(name[i] + "�л� ���� �Է� : ");

			for (int j = 0; j < subject.length; j++) {
				System.out.println(subject[i] + "����");
				jumsu[i][j] = Integer.parseInt(br.readLine());
			}
		}

//		if (ar.length == 0) {
//			System.out.println("���� ���� �����ϴ�");
//			System.exit(0);
//		} // ar.length : �����
//
//		// �̸� �Է� ����
//		// String[]subject = new String[ar.length];
//		System.out.printf("�̸��Է� : ");
//		String name = br.readLine();
//
//		String[] subject = { "����", "����", "����" };
//		
//		  for (int i = 0; i < ar.length; i++) { //subject[i] = ar[i];
//		  System.out.println(subject[i] + "  "); }
//		 
//		int jumsu[] = new int[subject.length + 1];// ������ �����ϱ� ���� ����
//
//		for (int i = 0; i < subject.length; i++) {
//			System.out.print(subject[i] + "���� : ");
//			jumsu[i] = Integer.parseInt(br.readLine());// ���� �Է� ����
//			// ������
//			jumsu[jumsu.length - 1] += jumsu[i];
//			System.out.println("���� : " + jumsu[jumsu.length - 1]);
//		}
//		float avg = jumsu[jumsu.length - 1] / (float) (subject.length);
//		// �Ҽ��� 3�ڸ����� �ݿø� �ݿ�
//		avg = (int) ((avg + 0.005) * 100) / 100.f;
//
//		// int �� �ʿ��Ѱ��� ã�ƶ�??
//
//		char grade = 0;
//		switch ((int) (avg / 10)) {
//		case 10:
//		case 9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//			break;
//		case 6:
//			grade = 'D';
//			break;
//		case 5:
//			grade = 'F';
//			break;
//			
//		default: grade = 'F';
//			break;
//
//		}
//		System.out.println("--------------------------------------");
//		System.out.println("--------"+name + "���� �� �� ǥ--------");
//		System.out.println("--------------------------------------");
	}

}
