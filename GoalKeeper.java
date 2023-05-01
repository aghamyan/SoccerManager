public class GoalKeeper extends Player {
    private int diving;
    private int handling;
    private int reflexes;

    public GoalKeeper(String name, int pac, int shot, int dribbling, int pass, int phys, int def, int age,
                      int diving, int handling, int reflexes) {
        super(name, pac, shot, dribbling, pass, phys, def, age);
        this.diving = diving;
        this.handling = handling;
        this.reflexes = reflexes;
    }

    // Getters and setters
    public int getDiving() {
        return diving;
    }

    public void setDiving(int diving) {
        this.diving = diving;
    }

    public int getHandling() {
        return handling;
    }

    public void setHandling(int handling) {
        this.handling = handling;
    }

    public int getReflexes() {
        return reflexes;
    }

    public void setReflexes(int reflexes) {
        this.reflexes = reflexes;
    }
}
