package Home_Works.HomeWork2;

import java.util.Scanner;

public class GreatestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter your second number");
        int secondNumber = scanner.nextInt();

        if(firstNumber > secondNumber){
            System.out.println("The number " + firstNumber + " has the greatest value");
        }else if(firstNumber == secondNumber){
            System.out.println("The numbers is equal");
        }else{
            System.out.println("The number " + secondNumber + " has the greatest value");
        }
    }
}
