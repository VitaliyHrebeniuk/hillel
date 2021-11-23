package Home_Works.HomeWork6;

import java.util.Scanner;

public class randomlyGeneratedString {
    public static void main(String[] args) {
        String modes = getStringFromScanner();
        int lenght = getIntFromScanner();
        System.out.println(generateString(modes, lenght));
    }

    public static int getIntFromScanner() {
        System.out.println("Get your int please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String getStringFromScanner() {
        System.out.println("Get your mode please(alpha,numeric,alphaNumeric):");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String generateString(String modes, int lenght){
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String num = "1234567890";
        int a = 0, b = 53, d = 10;
        StringBuilder alpha = new StringBuilder();
        StringBuilder numeric = new StringBuilder();
        StringBuilder alphaNumeric = new StringBuilder();
        String result = "";
        for(int i = 0;i<lenght;i++){
            int random_number1 = a + (int) (Math.random() * d);
            char charAt = num.charAt(random_number1);
            numeric.append(charAt);
        }
        for(int i = 0;i<lenght;i++){
            int random_number1 = a + (int) (Math.random() * d);
            char charAt = num.charAt(random_number1);
            numeric.append(charAt);
        }
        for(int i = 0;i<lenght;i++){
            int random_number1 = a + (int) (Math.random() * d);
            int random_number2 = a + (int) (Math.random() * b);
            char charAt = num.charAt(random_number1);
            char charAt2 = str.charAt(random_number2);
            alphaNumeric.append(charAt);
            alphaNumeric.append(charAt2);
        }
        if(modes.equals("alpha")){
            result += alpha;
        }else if(modes.equals("numeric")){
            result += numeric;
        }else if(modes.equals("alphaNumeric")){
            result += alphaNumeric;
        }
        return result;
    }
}
