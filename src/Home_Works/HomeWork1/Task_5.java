package Home_Works.HomeWork1;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = value.nextInt();
        System.out.println("Enter second number");
        int b = value.nextInt();

        int randomNumber = a + (int)(Math.random() * ((b - a) + 1));
        System.out.println("Random number: " + randomNumber);
    }
}
