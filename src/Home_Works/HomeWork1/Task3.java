package Home_Works.HomeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner weight = new Scanner(System.in);

        System.out.println("Enter your weight please - Example: 100");
        double kg = weight.nextDouble() * 0.454;
        System.out.println("Enter your height please - Example: 4,1");
        double meters = weight.nextDouble() / 39.370;

        double bmi = kg / Math.pow(meters, 2);

        System.out.println(bmi);
    }
}
