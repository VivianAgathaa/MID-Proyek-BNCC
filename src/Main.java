import java.util.Scanner;

import MainMenu.Car;
import MainMenu.Menu;
import MainMenu.Motorcycle;
import MainMenu.Vehicle;

public class Main {
	
	static Car car = new Car();
	static Motorcycle motorcycle = new Motorcycle();
	static Vehicle vehicle = new Vehicle();
	static Menu menu = new Menu();
	
	public static String type;

	public static void main(String args []) {
		Scanner sc= new Scanner(System.in);
		
		menu.runMenu();
	}
}
