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
}