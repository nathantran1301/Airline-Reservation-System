import java.util.Scanner;
public class Customer {
	private String name;
	private String address;
	private String Ethnicity;
	private String Gender;
	private String birthDate;
	private String phoneNumber;
	boolean customer = true;
	private String scanner;
	Scanner stdIn = new Scanner(System.in);
	
	public Customer(String name, String Ethnicity, String Gender, String address, String phoneNumber, String birthDate) {
		this.name = name;
		this.Ethnicity = Ethnicity;
		this.Gender = Gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
		
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getEth() {
		return Ethnicity;
	}
	public String getGender() {
		return Gender;
	}
	public String getBirth() {
		return birthDate;
	}
	public String getPhone() {
		return phoneNumber;
	}
	
	public void detailInfo() {
		
		System.out.println(getName() + '\n' + getEth() + '\n' + getGender() + '\n' + getAddress() + '\n' +
				getPhone() + '\n' + getBirth() + '\n');
			
		
	}
}
