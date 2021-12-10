package Home_Works.HomeWork10;

public class veterinarian {
    public static void main(String[] args) {
        Cat cat = new Cat("Murka","milk","sofa");
        Dog dog = new Dog("Sharik","meat","house");
        Horse horse = new Horse("Mustang","hay", "barn");
        Animal[] animals = {cat, dog, horse};
        treatAnimal(animals);
    }
    public static void treatAnimal(Animal[] animal){
        System.out.println("Animals list:");
        for (Animal animals : animal) {
            System.out.println(animals.getInfo());
        }
        System.out.println();
    }
}
