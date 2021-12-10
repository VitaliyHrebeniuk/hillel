package Home_Works.HomeWork10;

public class Horse extends Animal{
    String speed;

    public Horse(String name,String food, String location) {
        super(name, food, location);
    }

    @Override
    public void makeNoice(){
        System.out.println( "игого");
    }
    public void eat(){
        System.out.println("сена игого");
    }

}
