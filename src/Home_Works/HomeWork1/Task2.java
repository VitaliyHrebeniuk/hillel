package Home_Works.HomeWork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner minutes = new Scanner(System.in);
        System.out.println("Hello, i'm conver minutes into a number of years and days");
        int days = (minutes.nextInt() / 1440);
        int year = days / 365;
        System.out.println(year + " years " + days % 365 + " days ");
    }
}
