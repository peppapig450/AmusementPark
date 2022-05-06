public class Attraction {
    private int maxRiders;
    private int ticketCost;
    private int ticketNum;
    private int attendantNum;
    private int rideLength;
    private int ridersPerHour;
    private int hoursPerDay;
    private double speed;
    private double height;

    public Attraction(int mRider, int tCost, int tNum, int aNum, int rLength, int rPerHour, int hPerDay, double speed, double height) {
    this.maxRiders = mRider;
    this.ticketCost = tCost;
    this.ticketNum = tNum;
    this.attendantNum = aNum;
    this.rideLength = rLength;
    this.ridersPerHour = rPerHour;
    this.hoursPerDay = hPerDay;
    this.speed = speed;
    this.height = height;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    // retur
    public int getTicketNum() {
        return ticketNum;
    }
  
    public int getAttendantNum() {
        return attendantNum;
    }
  
    public int getRideLength() {
        return rideLength;
    }

    
}