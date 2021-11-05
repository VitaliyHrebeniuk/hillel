package Home_Works.HomeWork1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner weight = new Scanner(System.in);

        System.out.println("Enter your weight please - Example: 100");
        double weight1 = weight.nextDouble();
        System.out.println("Enter your height please - Example: 4,1");
        double height = weight.nextDouble();
        double bmi = weight1 / height;

        System.out.println(bmi);
    }
}
