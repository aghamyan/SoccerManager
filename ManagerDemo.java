public class ManagerDemo {
    public static double calculatePlayerRating(Player player) {
        double rating = 0.0;

        // Calculate rating based on player position
        if (player instanceof Forward) {
            Forward forward = (Forward) player;
            rating = 0.3 * forward.getPac() + 0.2 * forward.getShot() + 0.2 * forward.getDribbling() +
                    0.2 * forward.getPass() + 0.1 * forward.getPhys();
        } else if (player instanceof Midfielder) {
            Midfielder midfielder = (Midfielder) player;
            rating = 0.2 * midfielder.getPac() + 0.1 * midfielder.getShot() + 0.3 * midfielder.getDribbling() +
                    0.3 * midfielder.getPass() + 0.1 * midfielder.getPhys();
        } else if (player instanceof Defender) {
            Defender defender = (Defender) player;
            rating = 0.1 * defender.getPac() + 0.05 * defender.getShot() + 0.1 * defender.getDribbling() +
                    0.2 * defender.getPass() + 0.3 * defender.getDef() + 0.25 * defender.getTackling() +
                    0.1 * defender.getMarking() + 0.1 * defender.getHeading();
        } else if (player instanceof GoalKeeper) {
            GoalKeeper goalkeeper = (GoalKeeper) player;
            rating = 0.15 * goalkeeper.getShot() + 0.2 * goalkeeper.getHandling() +
                    0.15 * goalkeeper.getDiving() + 0.2 * goalkeeper.getReflexes() +
                    0.3 * goalkeeper.getPhys();
        }

        // Apply age factor
        rating *= Math.pow(0.95, player.getAge() - 20);

        return rating;
    }
    public static double calculatePlayerPrice(double rating, int age) {
        double basePrice = 1000000;
        double pricePerRating = 5000;
        double pricePerAge = -5000;

        double price = basePrice + (rating * pricePerRating) + (age * pricePerAge);
        return (int)price;
    }
    public static void main (String [] args){
        Forward forward1 = new Forward("Messi", 90, 85, 90, 80, 75, 50, 25, 85, 80, 85);
        double rating1 = ManagerDemo.calculatePlayerRating(forward1);
        double price1 = ManagerDemo.calculatePlayerPrice(rating1, forward1.getAge());
        System.out.println("Forward 1 price: " + price1 +"$");


    }



}
