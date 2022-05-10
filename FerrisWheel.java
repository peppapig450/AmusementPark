import java.lang.Math.*;
import java.util.ArrayList;

public class FerrisWheel extends Attraction 
{
  
  private double radius; 
  private double turnSpeed; 
  private double gForce; 
  private double circumference;
    
  private boolean isRomantic; 
  
  public FerrisWheel(int maxCapacity, int currentRiders,
                    double ticketCost, double height, double speed, double duration,
                    boolean isOpen, boolean isFatal,
                    String name, double radius, boolean isRomantic) {
    super(maxCapacity, currentRiders, ticketCost, height, speed, duration, isOpen, isFatal, name); 
    this.turnSpeed = speed/2; 
    this.gForce = (speed/duration)/9.8;
    this.radius = radius;
    this.circumference = Math.PI * 2 * radius;
    this.isRomantic = isRomantic; 
  }

  private String array = super.toString();
  ArrayList<String> list = array.asList(string.split("\\n+"));

    
  public double getTurnSpeed() {
    return turnSpeed;  
  }
  
  public double getGForce() {
    return gForce; 
  }

  public double getRadius() {
    return radius; 
  }

  public double getCircumference() {
    return circumference;
  }

  public boolean getIsRomantic() {
    return isRomantic; 
  }

 
  public String toString() {
     return super.toString()  ;
    }
}