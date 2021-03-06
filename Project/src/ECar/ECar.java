package ECar;

/*
 * 전기 자동차를 클래스로 작성해보자 자동차는 완전(100%) 베터리로 시작한다.
 * 자동차를 운전할 대마다 1km를 주행하고 배터리의 10%를 소모한다. 
 * 전기 자동차에는 2가지 정보를 보여주는 디스플레이가 있다.
 * 주행한 총 거리는 "주행거리 : ...km." 남은 베터리 충전량은 "베터리 : ...%"와 같이 표시된다.
 * 
 * 1.ECar.getInstance() : 새로운 자동차를 생성하는 정적메소드이다. 새로운 전기 자동차 인스턴스를 반환한다.
 * 		ECar car = ECar.getInstance();
 * 2. dispDistance() : 주행거리를 표시한다.
 * 3. dispBattery() : 베터리 백분율 표시한다.
 * 4. drive() : 한번 호출될 때마다 1km를 운행한다.
 */
public class ECar {
	private int batteryPersentage = 100;// 베터리 초기값
	private int distance = 0; // 주행거리 초기값

	public static ECar getInstance() {
		// 객체 반환.
		return new ECar();

	}

	public void dispDistance() {
		System.out.println(distance + "Km 주행하셨습니다.");
	}

	public void dispBattery() {
		if (this.batteryPersentage == 0) {
			System.out.println("베터리가 없습니다..충전해주세요..");
			return;
		}
		System.out.println("Battery : " + batteryPersentage + "% 남았습니다.");
	}

	public void drive() {
		if (this.batteryPersentage != 0) {
			this.distance += 1;
			this.batteryPersentage -= 10;
		}

	}

	public static void main(String[] args) {
		// ECar car = new ECar();
		ECar car = ECar.getInstance();
		car.drive();// 각 1km주행
		car.drive();
		car.drive();
		car.drive();
		car.drive();

		car.dispDistance();
		car.dispBattery();
	}

}
