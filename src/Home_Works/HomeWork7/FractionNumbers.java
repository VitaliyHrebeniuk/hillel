package Home_Works.HomeWork7;

import java.util.Scanner;


public class FractionNumbers {
    private int firstNumber;
    private int secondNumber;
    private String method;

    public FractionNumbers(int firstNumber, int secondNumber, String method) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.method = method;
    }

    public static int getIntFromScanner() {
        System.out.println("Write your number please:");
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
                return "" + plus(firstNumber, secondNumber);
            case"minus":
                return "" + minus(firstNumber, secondNumber);
            case"multiply":
                return "" + multiply(firstNumber, secondNumber);
            case"divide":
                if (secondNumber!=0) {
                    return "" + divide(firstNumber, secondNumber);
                }else {
                    return "you cannot divide by zero";
                }
            default:
                return "Wrong method!";
        }
    }

    public int plus(int firstNumber, int secondNumber){return firstNumber + secondNumber;}
    public int minus(int firstNumber, int secondNumber){return firstNumber - secondNumber;}
    public int multiply(int firstNumber, int secondNumber){return firstNumber * secondNumber;}
    public int divide(int firstNumber, int secondNumber){return firstNumber / secondNumber;}
}
