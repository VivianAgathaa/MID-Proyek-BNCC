package MainMenu;

import java.util.Scanner;

public class Motorcycle extends Vehicle{
	Vehicle update = new Vehicle();
	
	public static int wheel_motorcycle;
	public static String type_motorcycle;
	public static int helmet;
	public static double helmPrice;
	
	Scanner sc= new Scanner(System.in);
	
	public void input_motorcycle() {
		System.out.println("Input wheel [2 <= wheel <= 3]: "); 
		wheel_motorcycle = sc.nextInt();
			
		System.out.println("Input type [Automatic | Manual]: "); 
		type_motorcycle = sc.next();
		
		System.out.println("Input helmet [>= 1]: "); 
		helmet = sc.nextInt();
	}
	
	public void stand() {
		System.out.println(update.name + " is Standing!");
	}
	
	public void helm() {
		System.out.println("Input helm price(s): ");
		
		for(int i=0; i<helmet; i++) {
			helmPrice = sc.nextInt();
			System.out.println("Price: " + helmPrice);
		}
	}
}
