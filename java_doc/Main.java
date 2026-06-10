/**
* <h1>Drivers Records</h1>
* The AddNum program implements an application that
* <p>This program simply displays drivers records</p>
*@author Edmond Menya
* @version 1.0
*/
public class Main {
public static void main(String[] args) {
Car myCar=new Car();
myCar.driverName="Edmond";
myCar.numberPlate="KCW 339X";
System.out.println("Drivers name is "+myCar.driverName+" and his number plate is "+myCar.numberPlate);
}
}