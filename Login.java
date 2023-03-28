import java.util.Scanner;
public class Login {
	private String username; 
	private String password;
	private boolean login = true;
	private String scanner;
	Scanner stdIn = new Scanner(System.in);
	public void getLogin() {
		while(login) {
			System.out.println("Please Enter your Username (nathan1301) ");
			username = stdIn.nextLine();
		System.out.println("Please Enter your Password (airplanes00) ");
			password = stdIn.nextLine();	
			
		if(username.equals("nathan1301") && password.equals("airplanes00")) {
			
			System.out.println("Welcome to the Airline Reservation System ");
		} else {
			System.out.println("Please Try Again ");
			continue;
		}
		login = false;
	}
	}
}
