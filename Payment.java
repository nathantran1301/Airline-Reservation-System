import java.util.Scanner;
public class Payment {
	int scanner;
	String scanner2;
	String scanner3;
	String scanner4;
	Scanner stdIn = new Scanner(System.in);
	
	public String getName(String economy) {
		return economy;
	}
	
	public void Payment() {
		System.out.println("Enter a number between (1-3) to choose the following options:"
				+ "1. Economy Class " + '\t' + " 2. Business Class " + '\t' + " 3. First Class "
				+ '\t' + " Cancellation ");
		scanner = stdIn.nextInt();
		if (scanner == 1 ||scanner == 2 || scanner == 3) {
			System.out.println("Enter the following information: ");
			System.out.println("Credit Card Number: ");
			scanner2 = stdIn.nextLine();
			System.out.println("Enter Security Code (3 digits) ");
			scanner3 = stdIn.nextLine();
			System.out.println("Enter Expiration Date: ");
			scanner4 = stdIn.nextLine();
			
		} else {
			System.out.println("Invalid... ");
			System.out.println("Cancelling reservation ");
			System.out.println('\n');
			
			System.out.println("Enter flight number: ");
			String scanner5 = stdIn.nextLine();
			if(scanner5.equals("12345")) {
				System.out.println("Cancellation #: 6789 ");
				
			}
			System.out.println("Please enter Cancellation #: ");
			String scanner6 = stdIn.nextLine();
			if(scanner6.equals("6789")) {
				System.out.println("Flight Reservation is Canceled... ");
			}
		}
			
		}
		
	public void PrintPayment() {
		System.out.println("Provided Information: ");
		System.out.println("Credit Card Number: " + scanner2);
		System.out.println("Security Code ( 3 digits): " + scanner3);
		System.out.println("Expiration Date: " + scanner4);
		
	}
	
	
		
	}
	
	
	
	
	
	
	
	
	

