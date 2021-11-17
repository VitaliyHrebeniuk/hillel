package Home_Works.HomeWork3;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        System.out.println(evenOrOdd());
        System.out.println("BYE");

    }
    public static int getIntFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        return scanner.nextInt();
    }
    public static String evenOrOdd(){
        String even = ("Even Number");
        String odd = ("Odd Number");
        int value = getIntFromScanner()%2;
        if(value==0){
            return even;
        }else{
            return odd;
        }
    }
}
