package objecttestpack;

public class MoterBike {
	// 상태
	private int speed;

	public int getSpeed() {
		return speed;
	}

	// 행동
	public void setSpeed(int speed) {
		if (speed >= 0) {
			this.speed = speed;
			System.out.println(speed);
			System.out.println(this.speed);
		}
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		this.speed = this.speed - howMuch;
	}

	void start() {

		System.out.println("Bike Started");
	}

}
