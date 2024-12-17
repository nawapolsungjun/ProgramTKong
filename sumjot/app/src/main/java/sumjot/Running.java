package sumjot;
import java.util.Scanner;
public class Running {
    private double totalDistance; 
    private double totalCal; 
    private double weight; 
    private double speed; 

    public Running(double weight) {
        this.weight = weight;
        this.totalDistance = 0;
        this.totalCal = 0;
        this.speed = 0;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public double getTotalCal() {
        return totalCal;
    }

    public double getSpeed() {
        return speed;
    }
{
        speed += 0.1;
    }

    
    public void decreaseSpeed() {
        speed = Math.max(0, speed - 0.1);
    }
    public void run(int minutes) {
       
        double distance = speed * minutes / 60;
        totalDistance += distance;

        double calories = speed * 3.5 * weight / 200 * minutes;
        totalCal += calories;
    }

    public static void main(String[] args) {
        Running runner = new Running(60);

        runner.decreaseSpeed(); 
        runner.run(30); 
        
        System.out.println(" " + runner.getTotalDistance() + " ");
        System.out.println(" " + runner.getTotalCal() + " ");
    }
}