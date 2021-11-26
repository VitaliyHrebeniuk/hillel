package Home_Works.controlWork;

import java.util.Scanner;

public class reverseString {
    public static String stringReverse(){
        String str = getStringFromScanner();
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }

    private static String getStringFromScanner() {
        System.out.println("Enter value please:" );
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
