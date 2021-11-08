package Home_Works.HomeWork3;

import java.util.Scanner;

public class magnitudeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a = input.nextInt();
        System.out.print("Please enter second number: ");
        int b = input.nextInt();
        int firstNumber;
        int secondNumber;
        //-a == +a
        if(a<0){
            firstNumber = Math.abs(a);
        }else{
            firstNumber = a;
        }
        //-b == +b
        if(b<0){
            secondNumber = Math.abs(b);
        }else{
            secondNumber = b;
        }
        //calculation
        if(firstNumber == secondNumber){
            System.out.print(" Number is equals");
        }else if(firstNumber>secondNumber){
            System.out.print(a + " is greatest");
        }else{
            System.out.print(b + " is greatest");
        }
    }
}
