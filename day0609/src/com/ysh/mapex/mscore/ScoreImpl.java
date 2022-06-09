package com.ysh.mapex.mscore;

import java.io.*;
import java.util.List;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class MyComparator<T> implements Comparator<T> {

	public int compare(T o1, T o2) {

		ScoreVO s1 = (ScoreVO) o1;
		ScoreVO s2 = (ScoreVO) o2;

		int n = s1.getTot() - s2.getTot();

		if (n > 1) {
			return 1;// ��������
		} else if (n < 1) {
			return 1;
		}

		return 0;
	}

}

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> map;

	public ScoreImpl() {
		map = new HashMap<String, ScoreVO>();

	}

	@Override
	public int insert() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String hak;
		System.out.print("\n�й� �Է� : ");
		hak = br.readLine();

		if (map.containsKey(hak)) {
			System.out.println("�̹� �����ϴ� �й��Դϴ�.");
			return 0;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);

		System.out.print("�̸� �Է� : ");
		vo.setName(br.readLine());

		System.out.print("�������� : ");
		vo.setKor(Integer.parseInt(br.readLine()));

		System.out.print("�������� : ");
		vo.setEng(Integer.parseInt(br.readLine()));

		System.out.print("�������� : ");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo);// map�� �߰�

		return 1;// void �϶��� return �ʿ� ����.
	}

	@Override
	public int update() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String hak;
		System.out.print("\n������ �й� �Է� : ");
		hak = br.readLine();

		if (!map.containsKey(hak)) {
			System.out.println("�������� �ʴ� �й��Դϴ�.");
			return 0;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);

		System.out.print("�̸� �Է� : ");
		vo.setName(br.readLine());

		System.out.print("�������� : ");
		vo.setKor(Integer.parseInt(br.readLine()));

		System.out.print("�������� : ");
		vo.setEng(Integer.parseInt(br.readLine()));

		System.out.print("�������� : ");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo);// map�� �߰�

		return 1;// void �϶��� return �ʿ� ����.
	}

	@Override
	public void search() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		System.out.print("\n �˻��� �̸� �Է� : ");
		name = br.readLine();

		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			ScoreVO data = map.get(key);
			if (data.getName().equals(name)) {
				System.out.println(data.toString());

			}
			String hak;
			System.out.print("\n�˻��� �й� �Է� : ");
			hak = br.readLine();

			if (map.containsKey(hak)) {
				System.out.println(map.get(hak).toString());
			}
		}

	}

	@Override
	public int delete() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String hak;
		System.out.print("\n ������ �й� : ");
		hak = br.readLine();
		if (!map.containsKey(hak)) {
			System.out.println("�������� �ʴ� �ڷ� �Դϴ�.");
			return 0;
		}
		map.remove(hak);
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");

		return 1;
	}

	@Override
	public void writeAll() {

		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String key = it.next();
			ScoreVO data = map.get(key);
			System.out.println(data.toString());
		}

	}

	@Override
	public void writeSort() {

		List<ScoreVO> lists = new ArrayList<>();
		Set<String> set = map.keySet();
		Iterator<String> it1 = set.iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			lists.add(map.get(key));
		}
		// ��������
		Collections.sort(lists, Collections.reverseOrder(new MyComparator<ScoreVO>()));

		System.out.println("\n[������ ����]");
		Iterator<ScoreVO> it2 = lists.iterator();
		while (it2.hasNext()) {
			ScoreVO data = it2.next();
			System.out.println(data.toString());
		}

	}

}
