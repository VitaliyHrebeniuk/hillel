package Home_Works.HomeWork3;

import java.util.Scanner;

public class PrintNumberInWordIfElse {
    public static void main(String[] args) {
        System.out.println(printNumberInWord());
    }

    public static int getIntFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        return scanner.nextInt();
    }

    public static String printNumberInWord(){
        int number = getIntFromScanner();
        if(number == 1){
            return ("ONE");
        }else if(number == 2){
            return("TWO");
        }else if(number == 3){
            return("THREE");
        }else if(number == 4){
            return("FOUR");
        }else if(number == 5){
            return("FIVE");
        }else if(number == 6){
            return("SIX");
        }else if(number == 7){
            return("SEVEN");
        }else if(number == 8){
            return("EIGHT");
        }else if(number == 9){
            return("NINE");
        }else{
            return("OTHER");
        }
    }
}
