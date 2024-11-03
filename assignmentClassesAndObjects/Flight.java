package assignmentClassesAndObjects;

public class Flight {

    private static int totalFlights = 0; 
    private static int availableSeats=50;

    private int flightId;
    private String airline;
    private String departurePoint; 
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private double price;

    public Flight(int flightId, String airline, String departurePoint, String destination, String departureTime, String arrivalTime, double price) 
    {
        this.flightId = flightId;
        this.airline = airline;
        this.departurePoint = departurePoint;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        totalFlights++;
    }
    
    public int getFlightId() 
    {
        return flightId;
    }

    public void setFlightId(int flightId) 
    {
        this.flightId = flightId;
    }

    public String getAirline() 
    {
        return airline;
    }

    public void setAirline(String airline) 
    {
        this.airline = airline;
    }

    public String getDeparturePoint() 
    {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) 
    {
        this.departurePoint = departurePoint;
    }

    public String getDestination() 
    {
        return destination;
    }

    public void setDestination(String destination) 
    {
        this.destination = destination;
    }

    public String getDepartureTime() 
    {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) 
    {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() 
    {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) 
    {
        this.arrivalTime = arrivalTime;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }
    
    public static int getTotalFlights() 
    {
        return totalFlights;
    }

	public static int getAvailableSeats() 
	{
		return availableSeats;
	}
}

