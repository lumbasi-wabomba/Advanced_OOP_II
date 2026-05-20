import Car.java;


public class CarTest{
	public static void main (String args[]){
		Car c =  new Car();
		c.licensePlate = "BGT 810";
		c.speed = 60.0;
		c.maxSpeed = 100.0;
		
		System.out.println(c.licensePlate + " is moving at "+ c.speed+ "km/h.");
	}
}
