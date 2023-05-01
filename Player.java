public class Player {
    private String name;
    private int age;
    private int pac;
    private int shot;
    private int dribbling;
    private int pass;
    private int phys;
    private int def;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name, int pac, int shot, int dribbling, int pass, int phys, int def, int age) {
        this.name = name;
        this.pac = pac;
        this.shot = shot;
        this.dribbling = dribbling;
        this.pass = pass;
        this.phys = phys;
        this.def = def;
        this.age = age;
    }

    // Getters and setters
    public int getPac() {
        return pac;
    }

    public void setPac(int pac) {
        this.pac = pac;
    }

    public int getShot() {
        return shot;
    }

    public void setShot(int shot) {
        this.shot = shot;
    }

    public int getDribbling() {
        return dribbling;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getPhys() {
        return phys;
    }

    public void setPhys(int phys) {
        this.phys = phys;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
