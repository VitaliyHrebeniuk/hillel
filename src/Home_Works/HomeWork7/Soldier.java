package Home_Works.HomeWork7;

public class Soldier {
    private String name;
    private String surname;
    private int age;

    public Soldier(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Soldier name:" + name + "; Soldier surname:" + surname + "; Soldier age:" + age + ";";
    }
}
