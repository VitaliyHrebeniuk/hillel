package Home_Works.HomeWork4;

import java.util.Scanner;

public class quarterOfTheYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your month");
        int number = scanner.nextInt();
        if (number <= 3 && number > 0){
            System.out.println("Its a first quarter");
        }else if(number <= 6 && number >= 3){
            System.out.println("Its a second quarter");
        }else if(number <= 9 && number >= 6){
            System.out.println("Its a third quarter");
        }else if(number <= 12 && number >= 6){
            System.out.println("Its a fourth quarter");
        }

    }
}
