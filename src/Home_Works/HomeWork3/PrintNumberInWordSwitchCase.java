package Home_Works.HomeWork3;

import java.util.Scanner;

public class PrintNumberInWordSwitchCase {
    public static void main(String[] args) {
        System.out.println(getNumberInWord());
    }

    public static int getIntFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        return scanner.nextInt();
    }
    public static String getNumberInWord(){
        int number = getIntFromScanner();
        switch(number){
            case 1:
                return ("ONE");
            case 2:
                return("TWO");
            case 3:
                return("THREE");
            case 4:
                return("FOUR");
            case 5:
                return("FIVE");
            case 6:
                return("SIX");
            case 7:
                return("SEVEN");
            case 8:
                return("EIGHT");
            case 9:
                return("NINE");
            default:
                return("OTHER");
        }
    }
}
