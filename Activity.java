import java.io.Serializable;

public abstract class Activity implements Serializable {
    protected String date;
    protected double duration; // in minutes
    protected double distance; // in km

    public Activity(String date, double duration, double distance) {
        this.date = date;
        this.duration = duration;
        this.distance = distance;
    }

    public abstract double calculateCalories();

    public void display() {
        System.out.println("Date: " + date);
        System.out.println("Duration: " + duration + " mins");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Calories Burned: " + calculateCalories());
    }
}
