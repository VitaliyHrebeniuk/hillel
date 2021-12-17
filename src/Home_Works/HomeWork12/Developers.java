package Home_Works.HomeWork12;

public class Developers {
    public Developer getDeveloper(DeveloperType type) {
        Developer toReturn = null;
        switch (type) {
            case JAVADEV:
                toReturn = new JavaDeveloper();
                break;
            case CPPDEV:
                toReturn = new CppDeveloper();
                break;
        }
        return toReturn;
    }

}
