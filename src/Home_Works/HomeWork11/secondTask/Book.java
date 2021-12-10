package Home_Works.HomeWork11.secondTask;

import java.util.Objects;

public class Book implements Printable{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Printable printable1 = new Book("book1");
        Printable printable2 = new Book("book2");
        Printable[] printables = {printable1,printable2};
        printBooks(printables);
    }

    static void printBooks(Printable[] printables){
        for(Printable printable : printables){
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Book Name: " + getName());
    }
}
