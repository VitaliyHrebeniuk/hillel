package Home_Works.HomeWork3;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = scanner.nextInt();
        int value = number%2;
        if(value==0){
            System.out.println("Even Number");
            System.out.println("BYE");
        }else{
            System.out.println("Odd Number");
            System.out.println("BYE");
        }
    }
}
