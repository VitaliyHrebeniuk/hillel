package Home_Works.HomeWork6;

import java.util.Scanner;

public class countWordsInSomeText {
    public static void main(String[] args) {
        System.out.println("You have a " + getCount() + " words in your String");
    }

    public static String getStringFromScanner() {
        System.out.println("Get your string please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getCount(){
        String str = getStringFromScanner();
        if (str.isEmpty()) {
            return 0;
        }else{
            String[] words = str.split("\\s+");
            return words.length;
        }
    }
}
