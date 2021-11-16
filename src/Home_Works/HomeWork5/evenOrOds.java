package Home_Works.HomeWork5;

import java.util.Scanner;

public class evenOrOds {
    public static void main(String[] args) {
        if (getNumberEvenOrOds() == true){
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is Ods");
        }
    }

    public static int getIntFromScanner() {
        System.out.println("Get your number please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static boolean getNumberEvenOrOds(){
        if (getIntFromScanner() % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
