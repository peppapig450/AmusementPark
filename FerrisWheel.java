import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class FerrisWheel extends Attraction 
{
  
  private double radius; 
  private double turnSpeed; 
  private double gForce; 
  private double circumference;
    
  private boolean isRomantic; 
  
  private String str;
  private String[] strSplit;
  private ArrayList<String> strList;


  
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
    this.str = super.toString();
    this.strSplit = str.split("\\n");
    this.strList = new ArrayList<String>(Arrays.asList(strSplit));
  }
 
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

  public ArrayList<String> getStrList() {
    return strList;
  }

  @Override
  public String toString() {
     strList.add(5, "Ferris Wheel Turn Speed: " + turnSpeed);
     strList.add(6, "Ferris Wheel G Force: " + gForce);
     strList.add(7, "Ferris Wheel Radius: " + radius);
     strList.add(8, "Ferris Wheel Circumference: " + circumference);
     String toReturn = "";

     for (String s : strList) {
       toReturn += s + ".\n";
     }

     return toReturn;
    }
}