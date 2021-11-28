package Home_Works.controlWork;
import java.util.Scanner;

public class variantTasks {
    public static String getVariantTasks(){
        int number = getIntFromScanner();
        switch(number) {
            case 1:
                evenNumber getEvenNumber = new evenNumber();
                return getEvenNumber.getEvenNumber();
            case 2:
                armstrongNumber getArmstronNumber = new armstrongNumber();
                return getArmstronNumber.getArmstronNumber();
            case 3:
                reverseString stringReverse = new reverseString();
                return stringReverse.stringReverse();
            case 4:
                fibonacciNumber getfibonacciNumber = new fibonacciNumber();
                return getfibonacciNumber.getfibonacciNumber();
            case 5:
                replaceLetter getReplaceLetter = new replaceLetter();
                return getReplaceLetter.getReplaceLetter();
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
