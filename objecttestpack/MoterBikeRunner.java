package objecttestpack;

public class MoterBikeRunner {
	public static void main(String[] args) {
		MoterBike ducati = new MoterBike();
		MoterBike honda = new MoterBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		honda.setSpeed(80);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
	}

}
