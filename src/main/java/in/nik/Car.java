package in.nik;

public class Car {
	private IEngine eng;
	
	public Car(IEngine eng) {
		this.eng = eng;
		System.out.println("car :: constructor");
	}
	
	public void drive() {
		int result = eng.start();
		if (result ==0) {
			System.out.println("Driving Journery started.........");
		}
	}

}
