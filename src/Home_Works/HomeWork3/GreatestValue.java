package Home_Works.HomeWork3;

import java.util.Scanner;

public class GreatestValue {
    public static void main(String[] args) {
        System.out.println(getGreatestValue());


    }
    public static int getIntFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        return scanner.nextInt();
    }
    public static String getGreatestValue(){
        int firstNumber = getIntFromScanner();
        int secondNumber = getIntFromScanner();

        String returnFirstNumber = ("The number " + firstNumber + " has the greatest value");
        String returnSecondNumber = ("The number " + secondNumber + " has the greatest value");
        String returnEqualNumber = ("The numbers is equal");

        if(firstNumber > secondNumber){
            return returnFirstNumber;
        }else if(firstNumber == secondNumber){
            return returnEqualNumber;
        }else{
            return returnSecondNumber;
        }
    }
}
