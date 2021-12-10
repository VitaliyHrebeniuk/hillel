package Home_Works.HomeWork10;

public class Dog extends Animal {
    private String dogTypes;

    public Dog(String name,String food, String location) {
        super(name, food, location);
    }

    @Override
    public void makeNoice(){
        System.out.println("Гав-Гав");
    }
    public void eat(){
        System.out.println("Гав дай Гав мяса");
    }
}
