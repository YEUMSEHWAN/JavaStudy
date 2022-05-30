package study;

public class ThisEx02 {

	int aa;

	public ThisEx02(int a) {
		this.aa = a;

	}

	public void set(int aa) {
		this.aa = aa;
	}

	public static void main(String[] args) {
		ThisEx02 t1 = new ThisEx02(1);
		ThisEx02 t2 = new ThisEx02(2);
		ThisEx02 t3 = new ThisEx02(3);

		t1.set(4);
		t1.set(5);
		t1.set(6);

	}
}
