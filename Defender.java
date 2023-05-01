public class Defender extends Player {
    private int tackling;
    private int marking;
    private int heading;

    public Defender(String name,int pac, int shot, int dribbling, int pass, int phys, int def, int age,
                    int tackling, int marking, int heading) {
        super(name, pac, shot, dribbling, pass, phys, def, age);
        this.tackling = tackling;
        this.marking = marking;
        this.heading = heading;
    }

    // Getters and setters
    public int getTackling() {
        return tackling;
    }

    public void setTackling(int tackling) {
        this.tackling = tackling;
    }

    public int getMarking() {
        return marking;
    }

    public void setMarking(int marking) {
        this.marking = marking;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }
}
