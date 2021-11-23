package Home_Works.HomeWork6;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class productCodeValidation {
    public static void main(String[] args) {
        System.out.println(validateCode());
    }

    public static String getStringFromScanner() {
        System.out.println("Get your code please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String validateCode(){
        String[] s = getStringFromScanner().split(" ");
        String firstNumber = s[0].replaceAll("[A-Z]","");
        String firstLetters = s[0].replaceAll("[0-9]","");
        String proverka = firstLetters.toLowerCase();
        int secondNumber = Integer.parseInt(s[1]);
        String result = "";
        if(firstNumber.length() == 6){
            int number1 = Integer.parseInt(firstNumber.substring(0,2));
            int number2 = Integer.parseInt(firstNumber.substring(2,4));
            int number3 = Integer.parseInt(firstNumber.substring(4,6));
            int number4 = number1*number2*number3;
            if (number4 == secondNumber && firstLetters != proverka){
                result += "Your code is valid!";
            }else {
                result += "Your code is invalid";
            }
        }else {
            result += "Your code is invalid";
        }
        return result;
    }
}
