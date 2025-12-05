public class Cycling extends Activity {

    public Cycling(String date, double duration, double distance) {
        super(date, duration, distance);
    }

    @Override
    public double calculateCalories() {
        return distance * 45;
    }

    @Override
    public void display() {
        System.out.println("Activity: Cycling");
        super.display();
    }
}
