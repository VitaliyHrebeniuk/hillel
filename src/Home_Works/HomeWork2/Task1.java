package Home_Works.HomeWork2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner inches = new Scanner(System.in);
        System.out.println("Please, enter how inches you need to convert in metrs");
        int meters = inches.nextInt();
        double result = meters * 0.0254;
        System.out.println(result);
    }
}
