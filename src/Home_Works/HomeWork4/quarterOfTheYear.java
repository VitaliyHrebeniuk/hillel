package Home_Works.HomeWork4;

import java.util.Scanner;

public class quarterOfTheYear {
    public static void main(String[] args) {
        int number = getStringFromScanner();
        System.out.println(getQuarterOfTheYear(number));
    }

    public static int getStringFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your month");
        return scanner.nextInt();
    }

    public static String getQuarterOfTheYear(int number){
        String result = "";
        if (number <= 3 && number > 0){
            result = ("Its a first quarter");
        }else if(number <= 6 && number >= 3){
            result = ("Its a second quarter");
        }else if(number <= 9 && number >= 6){
            result = ("Its a third quarter");
        }else if(number <= 12 && number >= 6){
            result = ("Its a fourth quarter");
        }
        return result;
    }
}
