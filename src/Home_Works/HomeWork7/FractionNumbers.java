package Home_Works.HomeWork7;

import java.util.Scanner;

public class FractionNumbers {
    static int first_number;
    static int second_number;
    static String method;

    public FractionNumbers(int first_number, int second_number, String method) {
        this.first_number = FractionNumbers.first_number;
        this.second_number = FractionNumbers.second_number;
        this.method = FractionNumbers.method;
    }

    @Override
    public String toString(){
        if(method.equals("plus")) {
            return "" + plus(first_number, second_number);
        }else if(method.equals("minus")){
            return "" + minus(first_number, second_number);
        }else if(method.equals("multiply")){
            return "" + multiply(first_number, second_number);
        }else if(method.equals("divide")){
            return "" + divide(first_number, second_number);
        }else{
            return "Wrong method!";
        }
    }

    public int setSecond_number() {
        FractionNumbers.first_number = getIntFromScanner1();
        return first_number;
    }

    public int setFirst_number() {
        FractionNumbers.second_number = getIntFromScanner();
        return second_number;
    }

    public String setMethod() {
        FractionNumbers.method = getStringFromScanner();
        return method;
    }

    public int getIntFromScanner() {
        System.out.println("Write first_number please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int getIntFromScanner1() {
        System.out.println("Write second_number please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String getStringFromScanner() {
        System.out.println("What method do you need?(plus,minus,multiply,divide):");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int plus(int first_number, int second_number){return first_number + second_number;}
    public int minus(int first_number, int second_number){return first_number - second_number;}
    public int multiply(int first_number, int second_number){return first_number * second_number;}
    public int divide(int first_number, int second_number){return first_number / second_number;}
}
