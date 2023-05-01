public class Forward extends Player {

    private int finishing;
    private int positioning;
    private int acceleration;

    public Forward(String name, int pac, int shot, int dribbling, int pass, int phys, int def, int age,
                   int finishing, int positioning, int acceleration) {
        super(name, pac, shot, dribbling, pass, phys, def, age);
        this.finishing = finishing;
        this.positioning = positioning;
        this.acceleration = acceleration;
    }

    // Getters and setters
    public int getFinishing() {
        return finishing;
    }

    public void setFinishing(int finishing) {
        this.finishing = finishing;
    }

    public int getPositioning() {
        return positioning;
    }

    public void setPositioning(int positioning) {
        this.positioning = positioning;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public static void main (String [] args){
        Forward forward1 = new Forward("Messi",90, 85, 90, 80, 75, 50, 25, 85, 80, 85);
        double rating1 = ManagerDemo.calculatePlayerRating(forward1);
        System.out.println("Forward 1 rating: " + rating1);

        Forward forward2 = new Forward("Ronaldo",92, 87, 92, 85, 80, 55, 26, 87, 82, 87);
        double rating2 = ManagerDemo.calculatePlayerRating(forward2);
        System.out.println("Forward 2 rating: " + rating2);

        Forward forward3 = new Forward("Neymar",90, 80, 85, 75, 70, 45, 24, 82, 75, 82);
        double rating3 = ManagerDemo.calculatePlayerRating(forward3);
        System.out.println("Forward 3 rating: " + rating3);

        Forward forward4 = new Forward("Benzema",  90,83, 88, 78, 73, 48, 23, 84, 78, 84);
        double rating4 = ManagerDemo.calculatePlayerRating(forward4);
        System.out.println("Forward 4 rating: " + rating4);

        Forward forward5 = new Forward("Kane",86, 81, 86, 76, 71, 46, 22, 83, 76, 83);
        double rating5 = ManagerDemo.calculatePlayerRating(forward5);
        System.out.println("Forward 5 rating: " + rating5);


    }
}
