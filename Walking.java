public class Walking extends Activity {

    public Walking(String date, double duration, double distance) {
        super(date, duration, distance);
    }

    @Override
    public double calculateCalories() {
        return distance * 30;
    }

    @Override
    public void display() {
        System.out.println("Activity: Walking");
        super.display();
    }
}
