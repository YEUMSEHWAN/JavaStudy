package com.ysh.setex;

import java.util.*;

public class hashMapEx02 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("ȫ�浿", 90);// �Ǵ�
		map.put("ȫ�浿", new Integer(90));// �̷��� ��밡��
		map.put("�̼���", 100);
		map.put("�̱���", 60);
		map.put("���ڹ�", new Integer(50));

		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		/*
		 * Ű�� ���� set ���·� ����(HashMap�� �̿��ؼ� key�� value�� �����ֱ� ���ؼ� entry�� �̿���.
		 * 
		 * ����.��Ʈ��(Ű�� ���� �ѽ�(���)�̴�.) Map.Entry ���� entrySet() �޼ҵ尡 �ִµ� entrySet() �޼ҵ��
		 * ����(��Ŭ����) Ŭ������ ���ϴ� ��Ҹ� ������ ���� �÷��Ǻ並 �����ش�. ���� ��Ʈ���� ������ ����ϴ� ������ �����
		 * �ݺ���(Iterator)�� �̿��ؼ� �����.
		 */
		while (it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			System.out.println("�̸� : " + e.getKey() + ",���� : " + e.getValue());
		}
		Set set2 = map.keySet();
		System.out.println("�̸� : " + set2);

		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();

		int sum=0;
		while (it2.hasNext()) {
			int i = it2.next();
			sum += i;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("���� : " + sum);
		System.out.println("��� : "+sum/set2.size());
		System.out.println("�ִ밪 : " + Collections.max(v));
		System.out.println("�ּҰ� : " + Collections.min(v));
		
	}

}
