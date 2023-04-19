import java.util.Random;
import java.util.Scanner;

public class Player {
    private int attack;
    private int save;

    public Player(int attack, int save) {
        this.attack = attack;
        this.save = save;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }

    public boolean isGoal(Player opponent) {
        return this.attack > opponent.getSave();
    }
}