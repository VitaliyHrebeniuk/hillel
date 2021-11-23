package Home_Works.HomeWork6;

import java.util.Locale;
import java.util.Scanner;

public class upperLowerCaseChange {
    public static void main(String[] args) {
        if (getChoiceFromScanner().equals("upper")){
            System.out.println(getUpperCase());
        }else if (getChoiceFromScanner().equals("lower")){
            System.out.println(getLowerCase());
        }else{
            System.out.println("Choice \"upper\" or \"lower");
        }
    }

    public static String getLowerCase(){
        String s1=getStringFromScanner();
        return s1.toLowerCase();
    }

    public static String getUpperCase(){
        String s2=getStringFromScanner();
        return s2.toUpperCase();
    }

    public static String getChoiceFromScanner() {
        System.out.println("upper or lower?:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getStringFromScanner() {
        System.out.println("Get your string please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
