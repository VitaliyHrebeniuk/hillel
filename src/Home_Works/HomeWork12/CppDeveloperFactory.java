package Home_Works.HomeWork12;

public class CppDeveloperFactory implements DevelopersFabric {

    @Override
    public Developers createDeveloper() {
        return new CppDevelopers();
    }
}
