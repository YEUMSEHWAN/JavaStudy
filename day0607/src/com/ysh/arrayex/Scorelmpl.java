package com.ysh.arrayex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Scorelmpl implements Score {

	private Scanner sc = new Scanner(System.in);
	private List<ScoreVO> list = new ArrayList<ScoreVO>();

	@Override
	public void insert() {// �ڷ� ���
		System.out.println("\n �ڷ� ���.");

		String hak;
		System.out.printf("�й��Է� : ");
		hak = sc.next();

		ScoreVO temp = readScore(hak);

		if (temp != null) {
			System.out.println("�̹� ��ϵǾ� �ִ� �й��Դϴ�.");
			return;
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("�̸� �Է� : ");
		vo.setName(sc.next());// �̷��� �Ǵ�
		// String name = sc.next(); //�̷���
		// vo.setName(name);
		System.out.print("������� : ");
		vo.setBirth(sc.next());
		System.out.print("�������� : ");
		vo.setKor(sc.nextInt());
		System.out.print("�������� : ");
		vo.setEng(sc.nextInt());
		System.out.print("�������� : ");
		vo.setMat(sc.nextInt());

		list.add(vo);
		System.out.println("��� �Ϸ�!");

	}

	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;

		for (ScoreVO temp : list) {
			if (temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}
		return vo;
	}

	@Override
	public void delete() {// �ڷ� ����
		System.out.println("\n �ڷ� ����...");
		String hak;
		System.out.printf("������ �й� �Է� : ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.\n");
			return;
		}
		list.remove(vo);

		System.out.println("���� �Ϸ�.");

	}

	@Override
	public void update() {// �ڷ� ����

		System.out.println("\n �ڷ� ����.");

		String hak;
		System.out.printf("������ �й� �Է� : ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);

		if (vo == null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.");
			return;
		}
		System.out.printf("�̸� �Է� : ");
		vo.setName(sc.next());
		System.out.printf("������� : ");
		vo.setBirth(sc.next());
		System.out.printf("�������� : ");
		vo.setKor(sc.nextInt());
		System.out.printf("�������� : ");
		vo.setEng(sc.nextInt());
		System.out.printf("�������� : ");
		vo.setMat(sc.nextInt());

		System.out.println("���� �Ϸ�.");

	}

	@Override
	public void listAll() {// ���� �ڷ� ���
		System.out.println("\n ��� ��ü ���...");
		Iterator<ScoreVO> it = list.iterator();
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println("====================================================");
			System.out.println(vo);
		}
		System.out.println("====================================================");

	}

	@Override
	public void searchName() {// �̸����� �˻�
		System.out.println("\n �̸� �˻�..");
		String name;
		System.out.printf("�˻��� �̸� �Է� : ");
		name = sc.next();

		for (ScoreVO vo : list) {
			if (vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		}

	}

	@Override
	public void searchHak() {// �й����� �˻�
		System.out.println("\n �й� �˻�..");
		String hak;
		System.out.printf("�˻��� �й� �Է� : ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);

		if (vo != null) {
			// System.out.println(vo);//�̰� �Ǵ� �Ʒ���.
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getBirth() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.print(vo.getTot() / 3);

		}

	}
}