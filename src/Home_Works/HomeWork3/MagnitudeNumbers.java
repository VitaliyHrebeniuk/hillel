package Home_Works.HomeWork3;

import java.util.Scanner;

public class MagnitudeNumbers {
    public static void main(String[] args) {
        System.out.println(magnitudeNumbers());

    }

    public static int getIntFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        return scanner.nextInt();
    }
    public static String magnitudeNumbers(){
        int a = getIntFromScanner();
        int b = getIntFromScanner();
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
            return (" Number is equals");
        }else if(firstNumber>secondNumber){
            return (a + " is greatest");
        }else{
            return (b + " is greatest");
        }
    }
}
