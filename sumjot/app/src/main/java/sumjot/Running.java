package sumjot;
import java.util.Scanner;
public class Running {
    private double totalDistance; 
    private double totalCal; 
    private double weight; 
    private double speed; 

    public void Running(int weight) {
        this.weight = weight;
        this.totalDistance = 0;
        this.totalCal = 0;
        this.speed = 0;
    }

    private double calculateCalories(double time) {
        return speed * 3.5 * weight / 200 * time;
    }

    private void increaseDistance(double distance) {
        totalDistance += distance;
    }

    private void increaseCalories(double calories) {
        totalCal += calories;
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

    public void increaseSpeed() {
        speed += 0.1;
    }

    public void decreaseSpeed() {
        speed = Math.max(0, speed - 0.1);
    }

    public void run(int minutes) {
        double distance = speed * minutes / 60.0;
        double calories = calculateCalories(minutes); 
        increaseDistance(distance);
        increaseCalories(calories);
    }
}

    public static void main(String[] args) {
        Running runner = new Running(60);

        runner.increaseSpeed();
        runner.run(30);

        System.out.println("ระยะทางทั้งหมด: " + runner.getTotalDistance() + " กม.");
        System.out.println("แคลอรี่ทั้งหมด: " + runner.getTotalCal() + " กิโลแคลอรี่");
    }