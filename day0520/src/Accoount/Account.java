package Accoount;

public class Account {

	private String name;// ������
	private long balance;// �ܱ�

	public Account() {
	}

	public Account(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public long getBalance() {
		return balance;
	}

	// �Ա�
	public void deposit(long amount) {
		balance += amount;// �ܰ� ���� �Ա�

	}

	// ���
	public void withdraw(long amount) {
		if (balance <amount) {
			System.out.println("�ܾ��� �����մϴ�.");			
		}else {
			balance -= amount;
		}
		
	}

	public static void main(String[] args) {

	}

}
