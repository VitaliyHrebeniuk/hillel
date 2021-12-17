package Home_Works.HomeWork12;

public class Program {
    public static void main(String[] args) {
        Developers factory = new Developers();

        Developer javaDev = factory.getDeveloper(DeveloperType.JAVADEV);
        Developer cppDev = factory.getDeveloper(DeveloperType.CPPDEV);

        javaDev.writeCode();
        cppDev.writeCode();

    }
}
