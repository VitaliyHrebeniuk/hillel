package Home_Works.controlWork;

import java.util.Scanner;

public class evenNumber {
    public String getEvenNumber() {
        String result = "";
        String str = getNumberEvenOrOds();
        switch(str) {
            case "true":
                return result += "Your number is even";
            case "false":
                return result += "Your number is Ods";
            case "error":
                return result += "Write ONLY INTEGER!!!!";
            default:
                return "Write ONLY INTEGER!!!!";
        }
    }

    private String getStringFromScanner() {
        System.out.println("Get your number please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private String getNumberEvenOrOds() {
        String number = getStringFromScanner();
        number = number.replaceAll("[A-Za-z]", "");
        if(number.length()>0){
            int n = Integer.parseInt(number);
            if (n % 2 == 0) {
                return "true";
            } else {
                return "false";
            }
        }else {
            return "error";
        }
    }
}
