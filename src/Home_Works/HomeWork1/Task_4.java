package Home_Works.HomeWork1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("Enter meters");
        int meters = value.nextInt();
        System.out.println("Enter hour");
        int hour = value.nextInt();
        System.out.println("Enter minutes");
        int minutes = value.nextInt();
        System.out.println("Enter second");
        int second = value.nextInt();

        double seconds = (hour * 3600) + (minutes * 60) + second;
        double meters_s = meters / seconds;
        double km_h =  meters_s * 3.6;
        System.out.println("Your speed in meters/second is " + meters_s);
        System.out.println("Your speed in km/h is " + km_h);

    }
}
