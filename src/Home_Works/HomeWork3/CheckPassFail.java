package Home_Works.HomeWork3;

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int mark = scanner.nextInt();
        if(mark >= 50){
            System.out.println("PASS");
            System.out.println("DONE");
        }else{
            System.out.println("FAIL");
            System.out.println("DONE");
        }
    }
}
