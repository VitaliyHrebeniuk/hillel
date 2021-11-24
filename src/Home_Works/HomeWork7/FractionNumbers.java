package Home_Works.HomeWork7;

import java.util.Scanner;


public class FractionNumbers {
    private int first_number;
    private int second_number;
    private String method;

    public FractionNumbers(int firstNumber, int secondNumber, String method) {
        this.first_number = firstNumber;
        this.second_number = secondNumber;
        this.method = method;
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

    @Override
    public String toString(){
        switch(method) {
            case "plus":
                return "" + plus(first_number, second_number);
            case"minus":
                return "" + minus(first_number, second_number);
            case"multiply":
                return "" + multiply(first_number, second_number);
            case"divide":
                if (second_number!=0) {
                    return "" + divide(first_number, second_number);
                }else {
                    return "you cannot divide by zero";
                }
            default:
                return "Wrong method!";
        }
    }

    public int plus(int firstNumber, int second_number){return first_number + second_number;}
    public int minus(int first_number, int second_number){return first_number - second_number;}
    public int multiply(int first_number, int second_number){return first_number * second_number;}
    public int divide(int first_number, int second_number){return first_number / second_number;}
}