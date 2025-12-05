import java.io.*;
import java.util.ArrayList;

public class FitnessDatabase {

    public static void save(ArrayList<Activity> list) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("fitness.dat")
            );
            out.writeObject(list);
            out.close();
            System.out.println("Data saved successfully.");
        } catch (Exception e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public static ArrayList<Activity> load() {
        try {
            ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("fitness.dat")
            );
            ArrayList<Activity> list = (ArrayList<Activity>) in.readObject();
            in.close();
            return list;
        } catch (Exception e) {
            System.out.println("No previous data found.");
            return new ArrayList<>();
        }
    }
}
