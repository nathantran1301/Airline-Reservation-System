
public class Journey {
	private String flightNumber;
	private String destination;
	private String hostCountry;
	private String flightDate;
	private String flightTime;
	private String ticketID; // 2123895
	

		
	public Journey(String flightNumber, String ticketID, String flightDate, String flightTime, String hostCountry, String destination) {
		this.flightNumber = flightNumber;
		this.ticketID = ticketID;
		this.flightDate = flightDate;
		this.flightTime = flightTime;
		this.hostCountry = hostCountry;
		this.destination = destination;
		
	}
	
	public String getflightNumber() {
		return flightNumber;
	}
	public String getTicket() {
		return ticketID;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public String getFlightTime() {
		return flightTime;
	}
	public String getHostCountry() {
		return hostCountry;
	}
	public String getDestination() {
		return destination;
	}
	
	
	public void detailInfo() {
		System.out.println(getflightNumber() + '\n' + getTicket() + '\n' + getFlightDate() + '\n' +
				getFlightTime() + '\n' + getHostCountry() + '\n' + getDestination());
	}
	
		
}
	
		
		
	
	

	
	

