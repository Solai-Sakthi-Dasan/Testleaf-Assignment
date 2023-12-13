package week1.day1.assignment1;

public class Car {

	public static void main(String[] args) {
		
		// object is created
		Car car = new Car();
		car.carStart();
		car.applyAccelerator();
		car.applyBrakes();
		car.headlightOn();
		car.indicatorsOn();
		car.gearShift();
		car.acOn();
		car.radioOn();
		car.carOff();
	}
	
	public void carStart() {
		System.out.println("Car is ON...");
	}
	
	public void applyAccelerator() {
		System.out.println("Accelerator is applied...");
	}
	
	public void applyBrakes() {
		System.out.println("Brakes are applied");
	}
	
	public void headlightOn() {
		System.out.println("Head Lights are ON...");
	}
	
	public void indicatorsOn() {
		System.out.println("Indicators are ON...");
	}
	
	public void gearShift() {
		System.out.println("Gear is Shifted...");
	}
	
	public void acOn() {
		System.out.println("AC is ON...");
	}
	
	public void radioOn() {
		System.out.println("Radio is ON...");
	}
	
	public void carOff() {
		System.out.println("Car is OFF...");
	}

}
