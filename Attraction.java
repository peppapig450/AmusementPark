public class Attraction {
    private int maxCapacity;
    private int currentRiders;

    private double ticketCost;
    private double height;
    private double speed;
    private double duration;

    private boolean isOpen;
    private boolean isFatal;

    private String name;

    public Attraction(int maxCapacity, int currentRiders,
                     double ticketCost, double height, double speed, double duration,
                     boolean isOpen, boolean isFatal,
                     String name)
    {
        this.maxCapacity = maxCapacity;
        this.currentRiders = currentRiders;
        this.ticketCost = ticketCost;
        this.height = height;
        this.speed = speed;
        this.duration = duration;
        this.isOpen = isOpen;
        this.isFatal = isFatal;
        this.name = name;
    } 

    public int maxCapacity() {
        return maxCapacity;
    }

    public int currentRiders() {
        return currentRiders;
    }

    public double ticketCost() {
        return ticketCost;
    }

    public double height() {
        return height;
    }

    public double speed() {
        return speed;
    }

    public double duration() {
        return duration;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean isFatal() {
        return isFatal;
    }

    public String getName() {
        return name;
    }

    public String openStatus() {
        if (isOpen()) {
            return "The ride is open. ";
        } else {
            return "The ride is closed. ";
        }
    }

    public String fatalityStatus() {
        if (isFatal()) {
            return "The ride is fatal. ";
        } else {
            return "The ride isn't fatal. ";
        }
    }

    @Override
    public String toString() {
     return "Information about the " + this.getClass().getSimpleName() + " attraction " + name + ".\n" + openStatus() + fatalityStatus() + "\nRide Duration: " + duration + " minutes. \nRide Speed: " + speed + " kmh.\nRide Height: " + height + " meters.\nCost of each ticket: $" + ticketCost + ".\nCurrent riders: " + currentRiders + " riders. \nMax capacity of the ride: " + maxCapacity + " people.";
    }

}