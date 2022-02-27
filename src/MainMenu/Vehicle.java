package MainMenu;

import java.util.Scanner;

public class Vehicle {
	public static String brand;
	public static String name;
	public static String license;
	public static int topSpeed;
	public static int gasCap;
	
	Scanner sc= new Scanner(System.in);
	
	public void input() {
		System.out.println("Input brand [>=5]: "); 
		brand = sc.next();
			
		System.out.println("Input name [>=5]: "); 
		name = sc.next();
			
		System.out.println("Input license: ");   
		license = sc.next();
			
		System.out.println("Input top speed [100 <= topSpeed <= 250]: "); 
		topSpeed = sc.nextInt();
			
		System.out.println("Input gas capacity [30 <= gasCap <= 60]: "); 
		gasCap = sc.nextInt();
	}
}
