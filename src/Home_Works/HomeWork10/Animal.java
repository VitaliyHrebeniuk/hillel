package Home_Works.HomeWork10;

public class Animal {
    private String name;
    private String food;
    private String location;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public void makeNoice(){
        System.out.println("метод noice");
    }

    public void eat(){
        System.out.println("Anima is eating...");
    }

    public void sleep(){
        System.out.println("метод sleep");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("name", "food", "location");
        animal.makeNoice();
        animal.eat();
        animal.sleep();

        Cat cat = new Cat("Мурка", "fish", "sofa");
        cat.makeNoice();
    }
    public String getInfo() {
        return "name='" + name + '\'' + ", food='" + food + '\'' + ", location=" + location;

    }
}
