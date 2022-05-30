package study;

class ThisEx {

	String name, jumin, tel;

	public ThisEx() {
		this.name = "Guest";
		this.jumin = "000000-0000000";
		tel = "010-5480-4888";
	}

	public ThisEx(String name) {
		this();
		this.name = name;
	}

	public ThisEx(String name, String jumin) {
		this(name);
		this.jumin = "000000-0000000";
	}

	public ThisEx(String name, String jumin, String tel) {
		this(name, jumin);
		tel = "010-5480-4888";
	}

	public String getName() {
		return name;
	}

	public String getJumin() {
		return jumin;
	}

	public String getTel() {
		return tel;
	}

	
	
	
	
	
	
}

public class ThisEx04 {

	public static void main(String[] args) {

		ThisEx t = new ThisEx();
		System.out.println("이름 : " + t.getName());
		System.out.println("주민번호 : " + t.getJumin());
		System.out.println("전화번호 : " + t.getTel());

	}

}
