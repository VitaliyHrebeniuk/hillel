package Home_Works.HomeWork12;

public class Program {
    public static void main(String[] args) {
        DevelopersFabric developersFabric = new JavaDeveloperFactory();
        Developers javaDev = developersFabric.createDeveloper();

        DevelopersFabric developersFabric1 = new CppDeveloperFactory();
        Developers cppDev = developersFabric1.createDeveloper();

        javaDev.writeCode();
        cppDev.writeCode();
    }
}
