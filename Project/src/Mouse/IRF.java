package Mouse;

public interface IRF {// 인터페이스

	String RF_Type_IR = "적외선";// 상수
	String RF_Type_BT = "블루투스";// 상수

	// 메소드
	void wconnect();
	void Wdisconnect();

}
