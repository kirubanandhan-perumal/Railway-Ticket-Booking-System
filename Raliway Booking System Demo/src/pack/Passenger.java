package pack;

public class Passenger {

	String name;
	
	int age;
	
	String gender;
	
	String berthPreference; //Lower or Upper or Middle
	
	String allottedBerth;
	
	String ticketId; //Important for canceling tickets

	
	public Passenger(String name, int age, String gender, String berthPreference, String allottedBerth, String ticketId) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.berthPreference = berthPreference;
		this.allottedBerth = allottedBerth;
		this.ticketId = ticketId;
	}
	
	@Override
	public String toString() {
		return "Ticket ID: " + ticketId + ", Name: " + name + ", Age: " + age +
				", Gender: " + gender + ", Berth: " + allottedBerth;
	}
}
