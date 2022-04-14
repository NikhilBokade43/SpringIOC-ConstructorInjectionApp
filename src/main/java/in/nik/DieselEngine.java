package in.nik;

public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("Diesel Engine :: constructor");
	}

	public int start() {
		System.out.println("Diesel Engine :: start() method");
		return 0;
	}

}
