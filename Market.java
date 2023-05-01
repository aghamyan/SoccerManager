import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Market {
    private ArrayList<Player> players;
    private double balance;

    public Market() {
        players = new ArrayList<>();
        balance = 100000000;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public boolean buyPlayer(Player player, double price) {
        if (price >= ManagerDemo.calculatePlayerPrice(ManagerDemo.calculatePlayerRating(player), player.getAge())) {
            System.out.println("Offer too low.");
            return false;
        }

        double discount = (ManagerDemo.calculatePlayerPrice(ManagerDemo.calculatePlayerRating(player), player.getAge()) - price) / ManagerDemo.calculatePlayerPrice(ManagerDemo.calculatePlayerRating(player), player.getAge());

        if (discount >= 0.1) {
            // 10% chance of accepting offer that is 10% or more lower than the player's price
            double rand = new Random().nextDouble();
            if (rand >= 0.1) {
                System.out.println("Offer denied.");
                return false;
            }
        }

        // add player to user's team and deduct price from balance
        if (balance >= price) {
            balance -= price;
            players.add(player);
            System.out.println(player.getName() + " purchased for " + price);
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }



    public void sellPlayer(Player player, double price) {
        if (players.contains(player)) {
            players.remove(player);
            balance += price;
            System.out.println(player.getName() + " sold for " + price + ".");
        } else {
            System.out.println(player.getName() + " not found in your team.");
        }
    }


    public void marketMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the market! Your current balance is " + balance + ".");
        System.out.println("What would you like to do?");
        System.out.println("1. Buy a player");
        System.out.println("2. Sell a player");
        System.out.println("3. Exit");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        switch (choice) {
            case 1:
                System.out.println("Which player would you like to buy?");
                // display list of players available for purchase
                for (Player player : players) {
                    System.out.println(player.getName() + " (" + ManagerDemo.calculatePlayerPrice(ManagerDemo.calculatePlayerRating(player), player.getAge()) + ")");
                }
                String playerName = scanner.nextLine();
                System.out.println("How much are you willing to pay for " + playerName + "?");
                double price = scanner.nextDouble();
                scanner.nextLine(); // consume the newline character
                boolean playerFound = false;
                for (Player player : players) {
                    if (player.getName().equals(playerName)) {
                        playerFound = true;
                        if (buyPlayer(player, price)) {
                            System.out.println(player.getName() + " added to your team.");
                        } else {
                            System.out.println("Your offer was rejected.");
                        }
                        break;
                    }
                }
                if (!playerFound) {
                    System.out.println("Player not found.");
                }
                break;

            case 2:
                System.out.println("Which player would you like to sell?");
                // display list of players owned by the user
                for (Player player : players) {
                    System.out.println(player.getName() + " (" + ManagerDemo.calculatePlayerPrice(ManagerDemo.calculatePlayerRating(player), player.getAge()) + ")");
                }
                playerName = scanner.nextLine();
                System.out.println("How much do you want to sell " + playerName + " for?");
                price = scanner.nextDouble();
                scanner.nextLine(); // consume the newline character
                for (Player player : players) {
                    if (player.getName().equals(playerName)) {
                        sellPlayer(player, price);
                        return;
                    }
                }
                System.out.println("Player not found.");
                break;
            case 3:
                System.out.println("Exiting market.");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }



    public static void main(String[] args) {
        Market market = new Market();
        Forward forward1 = new Forward("Messi",90, 85, 90, 80, 75, 50, 25, 85, 80, 85);
       Forward forward2 = new Forward("Ronaldo", 90,87, 92, 85, 80, 55, 26, 87, 82, 87);
       Forward forward3 = new Forward("Halland", 90,80, 85, 75, 70, 45, 24, 82, 75, 82);
        market.addPlayer(forward1);
        market.addPlayer(forward2);
        market.addPlayer(forward3);
        market.marketMenu();
    }

}
