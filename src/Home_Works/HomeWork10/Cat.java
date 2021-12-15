package Home_Works.HomeWork10;

public class Cat extends Animal{
    private String catsBreed;

    public Cat(String name, String food, String location) {

        super(name,food, location);
    }

    @Override
    public void makeNoice(){
        System.out.println( "мяу-мяу");
    }
    public void eat(){
        System.out.println( "мяу хочу мяу рыбы");
    }
}
