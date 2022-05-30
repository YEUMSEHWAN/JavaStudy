package Member;

import java.util.Scanner;

public class DeleteAction implements Action {

	@Override
	public void excute(Scanner sc) {
		System.out.println("������ ȸ���� �̸��� �Է��ϼ���.");
		System.out.println("������ ȸ�� �̸� �Է� : ");
		String name = sc.next();
		// ������ ȸ���� �̸��� ���� ������ �ָ鼭 �ش� �̸��� ȸ���� �迭��ü���� �������ִ� �޼ҵ� ȣ��

		deleteMember(name);
	}

	private void deleteMember(String name) {
		int deleteindex = -1;// ȸ���� ���ٴ°� ������(�ε��� ��ȣ�� -1�� �ʱ�ȭ)

		MemberVO[] members = MemberMain.members;
		// ������ ȸ������ ��ü�� �ε��� ��ȣ�� ã�Ƴ��� ���� MembermainŬ������ static ������ �����Ǿ� �ִ�
		// members �迭 ���۷��� ������ ���۷��� ���� ������
		MemberVO[] temp = null;
		// ���� �迭�� ��ü���� ������ ȸ������ ��ü�� �����ϰ� ������ ȸ������ ��ü�� ������ �迭
		// ��ü ���۷��� �������� temp�� ������
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				// ���̸� ����,���� �迭��ü�� ����Ǿ� �ִ� ȸ�� ���� ��ü �� �Ķ���� ������ ���۵Ǿ� ��
				// name���� ����name�Ӽ� ������ ������ �ִ� ��ü�� �迭���� �ε��� ��ȣ�� ã�Ƴ�.
				deleteindex = i;
			}
		}
		if (deleteindex == -1) {// delectindex�� -1 �̶�� ���� �Ķ���� ���� �Ǿ� �� name ���� ����name ���� ������ �ִ�
			// ȸ�� ���� ��ü�� ã�� ���ߴٴ� �ǹ��̸� �޼����� ����ϰ� �޼ҵ带 ������
			System.out.println("ȸ�� ������ �������� �ʽ��ϴ�.");
			return;
		}
		if (members.length >= 1) {
			temp = new MemberVO[members.length - 1];
			// temp �迭 ��ü�� MemberMain Ŭ������ �����Ǿ� �ִ� members �迭�� ũ�⺸�� �ϳ� ���� ũ�⺸�� �ϳ� ���� ������

			for (int i = 0; i < members.length; i++) {// �迭�� ũ�⸦ ���̴� ����
				if (i == deleteindex) {
					continue;
					// ���� �ε����� �����Ϸ��� ȸ�������� �ε����� ������ continue�� �����Ͽ� �ǳʶ�, ȸ�������� ��ü�� �������� �ʴ´�.

				} else if (i > deleteindex) {
					temp[i - 1] = members[i];
					// ���� ���ؽ� ��ȣ�� �����Ϸ��� ȸ�� ������ �ε��� ���� �̸� �����Ϸ��°�ü��
					// �ε��� ��ȣ�� �ϳ� ������ �빮�� �����Ϸ��� �ε������� ū �ε����� �����ϴ�
					// ��ü���� ������ �ϳ��� �̵����Ѽ� ������
				} else
					temp[i] = members[i];
			}
		}
		MemberMain.members = temp;
		// �迭��ü temp �� MemberMainŬ������ static���� �����Ǿ� �ִ� members ������ ������
	}

}
