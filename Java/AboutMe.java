import java.util.Random;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        System.out.println("commands available:");
        System.out.println("name \t group \t mood");
        String command;
        int moodIndex;
        String[] moodArray = {"happy", "nervous", "starving", "tired", "motivated"};
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            command = sc.nextLine();
            if (command.equalsIgnoreCase("name")) {
                System.out.println("Musa");
            }
            if (command.equalsIgnoreCase("group")) {
                System.out.println("11-903");
            }
            if (command.equalsIgnoreCase("mood")) {
                moodIndex = random.nextInt(6);
                System.out.println(moodArray[moodIndex]);
            }
        }
    }
}
