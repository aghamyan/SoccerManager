public class Midfielder extends Player {
    private int passing;
    private int vision;


    public Midfielder(String name,int pac, int shot, int dribbling, int pass, int phys, int def, int age,
                      int passing, int vision) {
        super(name,pac, shot, dribbling, pass, phys, def, age);
        this.passing = passing;
        this.vision = vision;

    }

    // Getters and setters
    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    Midfielder DeJong = new Midfielder("De jong",88, 88, 90, 90, 89, 78, 20, 91, 92);
    double DeJongRating = ManagerDemo.calculatePlayerRating(DeJong);
    double DejongPrice = ManagerDemo.calculatePlayerPrice(DeJongRating, DeJong.getAge());

}


