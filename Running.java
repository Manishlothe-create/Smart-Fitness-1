public class Running extends Activity {

    public Running(String date, double duration, double distance) {
        super(date, duration, distance);
    }

    @Override
    public double calculateCalories() {
        return distance * 60; // simple formula
    }

    @Override
    public void display() {
        System.out.println("Activity: Running");
        super.display();
    }
}
