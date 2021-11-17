package Home_Works.HomeWork3;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        System.out.println(linearEquation());

    }

    public static int getIntFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        return scanner.nextInt();
    }

    public static double linearEquation() {
        double a = getIntFromScanner();
        double b = getIntFromScanner();
        double returnXZERO = 0;
        double x;
        double e = 0;
        if (a + b > 0) {
            x = -b / a;
            e = x;
        } else if (a + b < 0) {
            x = b / a;
            e = x;
        } else if (a + b == 0 || a - b == 0) {
            e = returnXZERO;
        }
        return e;
    }
}


