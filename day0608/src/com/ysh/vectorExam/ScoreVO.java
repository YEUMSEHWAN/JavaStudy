package com.ysh.vectorExam;

public class ScoreVO {

	private String hak, name, birth;
	private int kor, eng, mat, tot;

	public String getHak() {
		return hak;
	}

	public String getName() {
		return name;
	}

	public String getBirth() {
		return birth;
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

	public void setHak(String hak) {
		this.hak = hak;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirth(String birth) {
		this.birth = birth;
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

	public String toString() {
		String str = String.format("%7s %10s %8s %5d %5d %5d %5d %6.1f", hak, name, birth, kor, eng, mat, getTot(),
				(float) getTot() / 3);

		return str;
	}

}
