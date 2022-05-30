package newInter;

public class InterFaceEX02 implements Inter1, Inter2, Inter3 {
	int a = 100;

	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a+10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterFaceEX02 it = new InterFaceEX02();

		Inter1 it1 = it;
		Inter2 it2 = it;
		Inter3 it3 = it;

		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());

		System.out.println(it instanceof Object);
		System.out.println(it instanceof InterFaceEX02);
		System.out.println(it instanceof Inter1);
		System.out.println(it instanceof Inter2);
		System.out.println(it instanceof Inter3);
	}
}