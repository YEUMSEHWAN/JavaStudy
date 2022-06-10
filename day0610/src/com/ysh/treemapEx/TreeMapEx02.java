package com.ysh.treemapEx;

import java.util.*;

public class TreeMapEx02 {

	public static void main(String[] args) {
		TreeMap<String, ScoreRec> map = new TreeMap<>();

		map.put("3333", new ScoreRec("김말자", 90, 80, 70));
		map.put("2222", new ScoreRec("박말자", 92, 70, 75));
		map.put("1111", new ScoreRec("강말자", 80, 70, 100));
		map.put("5555", new ScoreRec("오말자", 60, 26, 35));
		map.put("9999", new ScoreRec("한말자", 30, 40, 68));

		String key;
		Set set = map.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			key = it.next();
			ScoreRec data = map.get(key);
			System.out.printf("%7s %10s %5d %5d %5d %5d\n", key, data.getName(), data.getKor(), data.getEng(), data.getMat(),data.getTot());

		}

	}

}
