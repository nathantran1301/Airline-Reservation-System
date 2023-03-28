import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int scanner;
		String scanner2;
		boolean flight = true;
		findSeat deck[] = new findSeat[2];
		findSeat seat[] = new findSeat[2];

		String seatLetter [] = {"A", "B", "C", "D", "E", "F"}; //5 index places
		String seatNumber [] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14",
				"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25"}; // 24 index places
		
		Login L1 = new Login();
		
		L1.getLogin(); //login screen / main menu
		
		System.out.println('\n');
		System.out.println("-------Passenger Details:------"); // Entering Passenger information
		
		System.out.println("Please enter all passenger Information: ");
		
		Customer c1 = new Customer("Name: Timmy","Ethnicity: Asian","Gender: Male","Address: 000 North Chicago Street","Phone Number: 123456","Birth Date: 1/05/00");
		c1.detailInfo(); // Passenger information
		Customer c2 = new Customer("Name: Antony", "Ethnicity: African American", "Gender: Male", "Address: 123 North Wisconsin Avenue", "Phone Number:78890", "Birth Date: 05/15/01");
		c2.detailInfo();
		
		System.out.println('\n');
		System.out.println("-------Journey Details:-------");
		
		// Travel details
		Journey j1 = new Journey("Flight #: 12345", "TicketID: 2123895", "Flight Date: Dec 1st 2022", "Fight time: 5:30pm", "Host Country: Denmark", "Destination: Germany");
			c1.getName();
			j1.detailInfo();
			System.out.println('\n');
			c2.getName();
			j1.detailInfo();
		
		
			int i = 0;
			for(int j = 0; j < 5; j++) {
				for(int h = 0; h < 24; h++) {
				deck [i] = new findSeat(seatLetter[j], seatNumber[h]);
				seat[i+1] = new findSeat(seatLetter[j], seatNumber[h]);
				}
			}
			
			for (i = 0; i < 100; i++) {
				// Random
				int ShuffleOne = (int) (Math.random() * 1000) % 1;
				int ShuffleTwo = (int) (Math.random() * 1000) % 1;
					
				findSeat temp = deck[ShuffleOne];
				deck[ShuffleOne] = deck[ShuffleTwo];
				deck[ShuffleTwo] = temp;
				
				
			}
					
			
			for (i = 0; i < deck.length; i++) {
				System.out.println(deck[i]);
				
		}
			
			
		System.out.println("-------Payment--------");
		
		Payment p1 = new Payment();
		
		while(flight) {
			System.out.println("Enter your flight number: ");
			scanner2 = stdIn.nextLine();
			
			if(scanner2.equals("12345")) {
				System.out.println("Proceeding with Payment Process... ");
			} else {
				System.out.println("Incorrect... ");
				continue;
			}
			flight = false;
		}
		
		
		p1.Payment();
		p1.PrintPayment();
		
		System.out.println("Reservation is Complete");
		
		
		
		
}
}