import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Activity> activities = FitnessDatabase.load();

        while (true) {
            System.out.println("\n--- SMART FITNESS TRACKER ---");
            System.out.println("1. Add Running");
            System.out.println("2. Add Walking");
            System.out.println("3. Add Cycling");
            System.out.println("4. View All Activities");
            System.out.println("5. Save & Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            try {
                if (ch >= 1 && ch <= 3) {
                    System.out.print("Date (dd/mm/yyyy): ");
                    String date = sc.nextLine();
                    System.out.print("Duration (minutes): ");
                    double duration = sc.nextDouble();
                    System.out.print("Distance (km): ");
                    double distance = sc.nextDouble();
                    sc.nextLine();

                    if (ch == 1) activities.add(new Running(date, duration, distance));
                    else if (ch == 2) activities.add(new Walking(date, duration, distance));
                    else activities.add(new Cycling(date, duration, distance));

                } else if (ch == 4) {
                    for (Activity a : activities) {
                        System.out.println("------------------------");
                        a.display();
                    }
                } else if (ch == 5) {
                    FitnessDatabase.save(activities);
                    break;
                } else {
                    System.out.println("Invalid choice!");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please try again.");
                sc.nextLine();
            }
        }

        System.out.println("Thank you for using Smart Fitness Tracker!");
    }
}
