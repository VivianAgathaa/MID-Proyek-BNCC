package MainMenu;

import java.util.Scanner;

import MainMenu.Car;
import MainMenu.Motorcycle;
import MainMenu.Vehicle;

public class Menu {
	boolean exit;
	
	public static Car car = new Car();
	public static Motorcycle motorcycle = new Motorcycle();
	public static Vehicle vehicle = new Vehicle();
	
	public static String type;
	
	private void printHeader() {
		System.out.println("--------------------------------------------");
		System.out.println("            Welcome to our Menu:            ");
		System.out.println("--------------------------------------------");
	}
	
	private void printMenu() {
		System.out.println("Enter your choice: ");
		System.out.println("1. Input");
		System.out.println("2. View");
//		System.out.println("0. Exit");
	}
	
	private void picking() {
		System.out.println("Brand: " + vehicle.brand);
		System.out.println("Name: " + vehicle.name);
		
		if(type.equals("Car")) {
			System.out.println("Type: " + car.type_car);
		}
		else if(type.equals("Motorcycle")){
			System.out.println("Type: " + motorcycle.type_motorcycle);
		}
		
		System.out.println("Gas Capacity: " + vehicle.gasCap);
		System.out.println("Top Speed: " + vehicle.topSpeed);
		
		if(type.equals("Car")) {
			System.out.println("Wheel(s): " + car.wheel_car);
			System.out.println("Entertainment System: " + car.entertainmentSys);
			
			car.onEntSys();
			if(car.type_car.equals("Supercar")) {
				car.onNitro();
			}
		}
		else if(type.equals("Motorcycle")){
			System.out.println("Wheel(s): " + motorcycle.wheel_motorcycle);
			System.out.println("Helmet(s): " + motorcycle.helmet);
			
			motorcycle.stand();	
			motorcycle.helm();
		}
	}
	
	private void doAction(int choice) {
		Scanner sc= new Scanner(System.in);
		int counter=0;
		
		switch(choice) {
			case 1:
				System.out.println("Input type [Car | Motorcycle]: ");
				type = sc.nextLine(); 

				counter++;
					
				vehicle.input();	
					
				if(type.equals("Car")) {
					car.input_car();
				}
				else if(type.equals("Motorcycle")) {
					motorcycle.input_motorcycle();
				}
			break;
			
			case 2:
				System.out.println("|----|---------------|-------------------|");
				System.out.println("|No  |Type           |Name               |");
				System.out.println("|----|---------------|-------------------|");
					
				for(int i=0; i<=counter; i++) {
					System.out.format("|%-4d|%-15s|%-19s|\n", counter+1, type, vehicle.name);
					System.out.println("|----|---------------|-------------------|");
					System.out.println("|----|---------------|-------------------|");
				}    
			break;
			
			default:
				System.out.println("Error!");
		}
	}
	
	private void testDrive(int choice2) {
		Scanner sc= new Scanner(System.in);
		int counter=0;
		
		switch(choice2) {
			case 0: 
				exit = true;
				break;
			
			case 1:
				picking();
				break;
			
			case 2:
				picking();
				break;
				
			case 3:
				picking();
				break;
				
			case 4:
				picking();
				break;
				
			case 5:
				picking();
				break;
			}
		}
	
	private int getInput() {
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		
		while(choice<0 || choice>2) {
			choice = sc.nextInt();
			sc.nextLine();
//			Integer.parseInt(sc.nextLine());
		}
		return choice;
	}
	
	public void runMenu() {
		printHeader();

		while(!exit) {
			printMenu();
			int choice = getInput();
			doAction(choice);
				
			if(choice == 2) {
				while(!exit) {
					System.out.println("\nPick a vehicle number to test drive [Enter'0' to exit]: ");
					
					int choice2 = getInput(); 
					testDrive(choice2);
				}
			}
		}
	}
}

