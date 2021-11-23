package Home_Works.HomeWork7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        FractionNumbers fractionNumbers = new FractionNumbers(getIntFromScanner(),getIntFromScanner1(),getStringFromScanner());
        System.out.println(fractionNumbers.toString());
    }

    public static int getIntFromScanner() {
        System.out.println("Write first_number please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int getIntFromScanner1() {
        System.out.println("Write second_number please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String getStringFromScanner() {
        System.out.println("What method do you need?(plus,minus,multiply,divide):");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
