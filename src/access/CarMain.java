package access;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car(0, 2, "채종훈");
		car.getCarInfo();
		System.out.println("---------");
		car.carAccel();
		car.carAccel();
		car.getCarInfo();
		System.out.println("---------");
		car.carBreak();
		car.carBreak();
		car.carBreak();
		car.carBreak();
		car.getCarInfo();
		
	}//CarMain

}//class
