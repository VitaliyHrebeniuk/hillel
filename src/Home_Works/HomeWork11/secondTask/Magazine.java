package Home_Works.HomeWork11.secondTask;

import java.util.Objects;

public class Magazine implements Printable{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Magazine(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Printable printable1 = new Magazine("magazine1");
        Printable printable2 = new Magazine("magazine2");
        Printable[] printables = {printable1,printable2};
        printMagazines(printables);
    }
     static void printMagazines(Printable[] printables){
         for(Printable printable : printables){
             printable.print();
         }
    }

    @Override
    public void print() {
        System.out.println("Magazine Name: " + getName());
    }

}
