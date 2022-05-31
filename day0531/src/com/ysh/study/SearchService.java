package com.ysh.study;

//���� ȸ���� �˻��ϴ� ��� ����
public class SearchService {
	Member[] members = new Member[5];

	public SearchService() {
		// �����ڸ� ȣ���ؼ� ��ü�� �����ɶ� �ټ����� �迭�� �����ϴ� �κ�
		// members ��ü�迭�� ȸ������ ������ ����

		members[0] = new Member("ȫ�浿", 175, 120, "������");
		members[1] = new Member("�� �� ", 187, 97, "�ѳ���");
		members[2] = new Member("��������", 175, 74, "������");
		members[3] = new Member("������", 152, 58, "���");
		members[4] = new Member("�̼���", 182, 86, "���");

	}

	// ȸ�� �̸��� �Ű������� �޾Ƽ� �ش� �̸��� ������ �ִ� ȸ�� ��ü �迭���� ã��
	// �ش� ȸ���� ������ ����ϴ� ��� ����
	boolean searchMember(String name) {

		boolean searchResult = false;

		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				// �ش� �̸��� ȸ���� ã�� ������ ������ ���
				prtInfo(members[i]);
				searchResult = true;

			}
		}
		return searchResult;
	}

	// �Ķ���� ������ ȸ����ü�� ������ �޾Ƽ� ����ϴ� �޼ҵ�
	private void prtInfo(Member member) {
		System.out.println(member.getName() + "���� ã�� �����");
		System.out.println("�̸� : " + member.getName());
		System.out.println("���� : " + member.getHeight()+" Cm");
		System.out.println("������ : " + member.getWeight()+" Kg");
		System.out.println("���� : " + member.getNation()+" �Դϴ�.");

	}

}
