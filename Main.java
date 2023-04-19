import java.util.Scanner;
import java.util.Random;

public class Main {
    private static int balance = 1000; // initial balance of $1000

    public static void main(String[] args) {
        Forward[] forwards = {
                new Forward("Messi", 95),
                new Forward("Ronaldo", 93),
                new Forward("Neymar", 90),
                new Forward("Mbappe", 88),
                new Forward("Haaland", 86)
        };

        GoalKeeper[] goalkeepers = {
                new GoalKeeper("Neuer", 88),
                new GoalKeeper("Oblak", 90),
                new GoalKeeper("Ederson", 86),
                new GoalKeeper("Alisson", 85),
                new GoalKeeper("Courtois", 87)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your bet amount:");
        int betAmount = scanner.nextInt();
        if (betAmount > balance) {
            System.out.println("Bet amount cannot be greater than balance!");
            return;
        }

        System.out.println("Select a forward:");
        for (int i = 0; i < forwards.length; i++) {
            System.out.println((i+1) + ") " + forwards[i].getName());
        }
        int selectedForwardIndex = scanner.nextInt() - 1;
        Forward selectedForward = forwards[selectedForwardIndex];

        Random random = new Random();
        int randomIndex = random.nextInt(goalkeepers.length);
        GoalKeeper selectedGoalkeeper = goalkeepers[randomIndex];

        System.out.println("Selected forward: " + selectedForward.getName() + " (Rating: " + selectedForward.getRating() + ")");
        System.out.println("Selected goalkeeper: " + selectedGoalkeeper.getName() + " (Rating: " + selectedGoalkeeper.getRating() + ")");

        if (selectedForward.getRating() > selectedGoalkeeper.getRating()) {
            System.out.println(selectedForward.getName() + " scored a goal!");
            balance += betAmount * 2; // double the bet amount and add to the balance
        } else {
            System.out.println(selectedGoalkeeper.getName() + " saved the shot!");
            balance -= betAmount; // reduce the bet amount from the balance
        }

        System.out.println("Balance: $" + balance);
    }

}