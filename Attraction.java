public class Attraction {
    private int maxRiders; // Max amount of riders that can be on the ride.
    private int ticketNum; // Number of tickets to use.
    private int ridersPerHour; //Number of riders that use the attraction per hour.
    private int hoursPerDay; // How many hours in a day the attraction is runing.
    private double speed; // The ride's speed.
    private double height; // How tall the ride is.
    private double rideLength; // How many minutes the ride runs for each time.
    private double ticketCost; // How much a ticket for the ride costs.
    private double utilityCost; // Daily cost to keep the ride running.
    private String name; // Name of the ride.


    public Attraction(String name, int mRider, double tCost, int tNum,
                     double rLength, int rPerHour, int hPerDay, double speed, double height,
                     double uCost) {
    this.name = name;
    this.utilityCost = uCost;
    this.maxRiders = mRider;
    this.ticketCost = tCost;
    this.ticketNum = tNum;
    this.rideLength = rLength;
    this.ridersPerHour = rPerHour;
    this.hoursPerDay = hPerDay;
    this.speed = speed;
    this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getUtilityCost() {
        return utilityCost;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public int getTicketNum() {
        return ticketNum;
    }
  
    public double getRideLength() {
        return rideLength;
    }
  
    public int getRidersPerHour() {
        return ridersPerHour;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public double getSpeed() {
        return speed;
    }
  
    public double getHeight() {
        return height;
    }

    public double dailyProfit() {

    }
}