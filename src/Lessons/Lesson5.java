package Lessons;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        getNumberEvenOrOds();
    }

    public static int getIntFromScanner() {
        System.out.println("Get your number please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static String getNumberEvenOrOds(){
        String even = ("Even");
        String ods = ("Ods");
        if (getIntFromScanner() % 2 == 0){
            System.out.println(even);
            return even;
        }else{
            System.out.println(ods);
            return ods;
        }
    }
}
