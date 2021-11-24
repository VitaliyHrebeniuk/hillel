package Home_Works.HomeWork7;

public class soldierInformation {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("AK-47",5.45,1000);
        Soldier soldier = new Soldier("Ivan", "Matrosov", 25);
        Rank rank = new Rank("Captain");

        System.out.println(weapon.toString());
        System.out.println(soldier.toString());
        System.out.println(rank.toString());
    }
}
