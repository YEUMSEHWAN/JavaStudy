package study;

class BookEx {

	String title;
	String author;

	public void show() {
		System.out.println(title + " " + author);
	}

	public BookEx() {
		this("", "");
		System.out.println("������ ȣ����");
	}

	public BookEx(String title) {
		this(title, "���� �̻�");
	}

	public BookEx(String title, String author) {
		this.title = title;
		this.author = author;

	}

	public class ThisEx03 {

		public void main(String[] args) {

			BookEx be = new BookEx("ȫ�浿��", "���");
			BookEx be2 = new BookEx("ȫ�浿��");
			BookEx be3 = new BookEx();
			be.show();
			be2.show();
			be3.show();
			
			
		
		
		}
	}
}
