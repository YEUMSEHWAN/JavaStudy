package com.ysh.mapex.mscore;

public class ScoreVO {

	private String name, hak;
	private int kor, eng, mat, tot;

	public void setName(String name) {
		this.name = name;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public String getName() {
		return name;
	}

	public String getHak() {
		return hak;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public int getTot() {
		tot = kor + eng + mat;
		return tot;
	}

	@Override
	public String toString() {

		String str = String.format("%7s%10s%5d%5d%5d%5d%6.1f", hak, name, kor, eng, mat, getTot(),
				(double) getTot() / 3);

		return str;
	}
}
