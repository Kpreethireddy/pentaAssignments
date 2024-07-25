package penta.assignments;
 interface Airline {
    boolean checkAvailability(String flightCode);
}
 class AirAsia implements Airline {
    private String[] availableFlights = {"AA101", "AA202", "AA303"};

    
    public boolean checkAvailability(String flightCode) {
        for (String flight : availableFlights) {
            if (flight.equals(flightCode)) {
                return true;
            }
        }
        return false;
    }
}

 class Indigo implements Airline {
    private String[] availableFlights = {"IG101", "IG202", "IG303"};

   
    public boolean checkAvailability(String flightCode) {
        for (String flight : availableFlights) {
            if (flight.equals(flightCode)) {
                return true;
            }
        }
        return false;
    }
}
public class FlightBooking {

	public static void main(String[] args) {
		
		  Airline airAsia = new AirAsia();
	        Airline indigo = new Indigo();

	       
	        String flightCodeAA = "AA202";
	        if (airAsia.checkAvailability(flightCodeAA)) {
	            System.out.println("Flight " + flightCodeAA + " is available with AirAsia.");
	        } else {
	            System.out.println("Flight " + flightCodeAA + " is not available with AirAsia.");
	        }

	       
	        String flightCodeIG = "IG404";
	        if (indigo.checkAvailability(flightCodeIG)) {
	            System.out.println("Flight " + flightCodeIG + " is available with Indigo.");
	        } else {
	            System.out.println("Flight " + flightCodeIG + " is not available with Indigo.");
	        }
	    }
	}
	


