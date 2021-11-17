package Home_Works.HomeWork3;

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        System.out.println(checkPassOrFail());
        System.out.println("DONE");
    }

    public static int getIntFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        return scanner.nextInt();
    }

    public static String checkPassOrFail(){
        String pass = ("PASS");
        String fail = ("FAIL");
        if(getIntFromScanner() >= 50){
            return pass;
        }else{
            return fail;
        }
    }
}
