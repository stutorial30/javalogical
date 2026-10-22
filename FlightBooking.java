package sidharthsircorejava;

public class FlightBooking implements Bookable{
	 String passengerName;
	 String flightName = "IndiGo";
	@Override
	public void bookTicket(String passengerName) {
		this.passengerName = passengerName;
        System.out.println("Flight ticket booked successfully.");
	}
	@Override
	public void getBookingDetails() {
		System.out.println("Booking Type: Flight");
        System.out.println("Airline: " + flightName);
        System.out.println("Passenger Name: " + passengerName);
	}

}
