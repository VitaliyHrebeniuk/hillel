package Home_Works.controlWork;

import java.util.Scanner;

public class replaceLetter {

    private static String getStringFromScanner() {
        System.out.println("Get your string please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getReplaceLetter(){
        String s = getStringFromScanner();
        if(s.length()<=30){
            String result = s.replaceAll("[a]", "@");
            result = result.replaceAll("[o]", "0");
            return result;
        }else{
            return "Your String is too long!";
        }
    }
}
