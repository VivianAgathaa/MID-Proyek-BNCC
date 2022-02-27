package MainMenu;

import java.util.Scanner;

public class Car extends Vehicle {
	public static int wheel_car;
	public static String type_car;
	public static int entertainmentSys;
	
	Scanner sc= new Scanner(System.in);
	
	public void input_car() {
		System.out.println("Input wheel [4 <= wheel <= 6]: "); 
		wheel_car = sc.nextInt();
		
		System.out.println("Input type [SUV | Supercar | Minivan]: ");
		type_car = sc.next();
			
		System.out.println("Input entertainment system [>= 1]: "); 
		entertainmentSys = sc.nextInt();
	}
	
	public void onEntSys() {
		System.out.println("Turning on Entertainment system...");
	}
	
	public void onNitro() {
		System.out.println("Boosting!");
	}
}
