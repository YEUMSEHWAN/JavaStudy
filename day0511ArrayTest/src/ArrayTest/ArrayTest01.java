package ArrayTest;

/*
 * ��]
 * �л� ���� �Է¹޾� �Է¹��� �ο��� ��ŭ �л��� �̸��� ��ȭ��ȣ�� �Է¹ް�
 * �Է¹��� ������ ��ü�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��,�迭�� �̿��Ͽ� �ۼ��Ͻÿ�.
 * 
 * �л��� : 3��
 * �̸�,��ȭ��ȣ �Է� :(1)[���鱸��] : ȫ�浿 010-1111-1111
 * �̸�,��ȭ��ȣ �Է� :(2)[���鱸��] : �̼��� 010-2222-2222
 * �̸�,��ȭ��ȣ �Է� :(3)[���鱸��] : ������ 010-3333-3333
 * -------------------------------------------------
 * �Է� ���� �л� �� : 3��
 * -------------------------------------------------
 * �̸�		��ȭ��ȣ
 * ȫ�浿		010-1111-1111
 * �̼���		010-2222-2222
 * ������		010-3333-3333
 * -------------------------------------------------
 */
import java.util.*;

public class ArrayTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.printf("�л��� : ");
		a = sc.nextInt();

		String name[] = new String[a];
		String phone[] = new String[a];
		
		
		for(int i=0;i<name.length;i++) {
			System.out.println("�̸� ��ȭ��ȣ �Է�("+(i+1)+"):[���鱸��]:");
			name[i] = sc.next();
			phone[i] = sc.next();
		}
		System.out.println();
		System.out.println("=======================");
		System.out.println("  �Է¹��� �л� �� : "+a+"��");
		System.out.println("=======================");
		System.out.println("    �̸�    ��ȣ   " );
		
		for(int i = 0;i<name.length;i++) {
			System.out.println(name[i] + "   "+phone[i]);
		}
		System.out.println("=======================");

}
}