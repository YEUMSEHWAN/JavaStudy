package study;

public class ArrSizeEx01 {

	public static void main(String[] args) {

		int aa[] = { 10, 20, 30, 40, 50, };// �迭�� ����. �ʱ�ȭ ������ ���� ������ 5���� �����ȴ�.
		int count, size;// �迭 ����� ������ �迭�� ���� ũ�⸦ ������ ������ �����Ѵ�.

		count = aa.length;// �迭 ����� ������ ����Ѵ�.
		size = count * Integer.BYTES;// �迭�� ��ü ũ��(����Ʈ)�� ����Ѵ�.

		System.out.printf("�迭 [aa]�� ����� ������ %d �� �Դϴ�. \n", count);
		System.out.printf("�迭 [aa]�� ����� ��ü ũ��� %d byte�Դϴ�. \n", size);

	}

}
