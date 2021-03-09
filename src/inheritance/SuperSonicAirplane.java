package inheritance;

public class SuperSonicAirplane extends Airplane{
	

	public int speed;

	public void fly() {
		
		if(speed > 1000) {
			
		}else {
			super.fly();
			
		}//if
		
		System.out.println("초음속 비행을 합니다.");
		System.out.println("시속: " + speed + "km/s");
	}

}//class
