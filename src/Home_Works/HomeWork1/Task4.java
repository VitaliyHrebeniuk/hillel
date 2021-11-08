package Home_Works.HomeWork1;

import java.util.Scanner;

public class Task4 {
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
        double metersToSecond = meters / seconds;
        double kmPerHour =  metersToSecond * 3.6;
        System.out.println("Your speed in meters/second is " + metersToSecond);
        System.out.println("Your speed in km/h is " + kmPerHour);

    }
}
