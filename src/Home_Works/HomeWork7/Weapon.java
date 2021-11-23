package Home_Works.HomeWork7;

public class Weapon {
    private String name;
    private double caliber;
    private int distance;

    public Weapon(String name, double caliber, int distance) {
        this.name = name;
        this.caliber = caliber;
        this.distance = distance;
    }


    @Override
    public String toString() {
       return "Weapon name:" + name + "; Caliber:" + caliber + "; Distance:" + distance + ";";
    }
}
