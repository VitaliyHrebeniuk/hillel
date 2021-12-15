package Home_Works.HomeWork12;

public class JavaDeveloperFactory implements DevelopersFabric{
    @Override
    public Developers createDeveloper() {
        return new JavaDevelopers();
    }
}
