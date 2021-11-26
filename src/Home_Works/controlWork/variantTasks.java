package Home_Works.controlWork;

import java.util.Scanner;

import static Home_Works.controlWork.armstrongNumber.getArmstronNumber;
import static Home_Works.controlWork.evenNumber.getEvenNumber;
import static Home_Works.controlWork.fibonacciNumber.getfibonacciNumber;
import static Home_Works.controlWork.replaceLetter.getReplaceLetter;
import static Home_Works.controlWork.reverseString.stringReverse;

public class variantTasks {
    public static String getVariantTasks(){
        int number = getIntFromScanner();
        switch(number) {
            case 1:
                return getEvenNumber();
            case 2:
                return getArmstronNumber();
            case 3:
                return stringReverse();
            case 4:
                return getfibonacciNumber();
            case 5:
                return getReplaceLetter();
            default:
                return "Wrong Task!";
        }
    }

    private static int getIntFromScanner() {
        System.out.println("What are you need?:\n 1. Even Number \n 2. Armstrong\n 3. Reverse\n 4. Fibonacci\n 5. Replace" );
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
