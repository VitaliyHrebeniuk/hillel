package Home_Works.HomeWork9;

public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1, "ХЗ", "22.12.1996", "+9379992");
        Reader reader2 = new Reader("Иванов В.В.", 2, "ХЗ", "11.10.1997", "+9312379992");
        Reader reader3 = new Reader("Сидоров В.В.", 3, "ХЗ", "05.08.2010", "+93741239992");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Кобзарь", "Шевченко");
        Book book2 = new Book("Сказки", "Голова Два Уха");
        Book book3 = new Book("Голова два уха", "Моряк Папай");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(5);
        reader2.takeBook("Я люблю Майнкрафт, Стив", "Java программирование, Шилдт");
        reader3.takeBook(book1, book2, book3);

        reader1.returnBook(1);
        reader2.returnBook("Java программирование, Шилдт");
        reader3.returnBook(book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println(reader.getInfo());
        }
        System.out.println();
    }
}
