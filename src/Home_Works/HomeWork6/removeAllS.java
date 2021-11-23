package Home_Works.HomeWork6;

import java.util.Scanner;

public class removeAllS {
    public static void main(String[] args) {
        System.out.println(removeChar());
    }

    public static String getStringFromScanner() {
        System.out.println("Get your string please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String removeChar() {
        String s = getStringFromScanner();
        String result = s.replaceAll("[Ss]","");
        return result;
    }
}