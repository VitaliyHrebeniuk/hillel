package Home_Works.HomeWork11.secondTask;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable book1 = new Book("book1");
        Printable book2 = new Book("book2");
        Printable magazine1 = new Magazine("magazine1");
        Printable magazine2 = new Magazine("magazine2");

        Printable[] printables = {book1,book2,magazine1,magazine2};
        for(Printable printable : printables){
            printable.print();
        }
    }
}
