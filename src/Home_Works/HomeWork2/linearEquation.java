package Home_Works.HomeWork2;

import java.util.Scanner;

public class linearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value for a: ");
        double a = input.nextDouble();
        System.out.print("Please enter the value for b: ");
        double b = input.nextDouble();

        double x;
        if (a + b > 0) {
            x = -b / a;
            System.out.println(x);
        } else if (a + b < 0) {
            x = b / a;
            System.out.println(x);
        } else if (a + b == 0 || a - b == 0) {
            System.out.println("x = 0");
        }
    }
}
