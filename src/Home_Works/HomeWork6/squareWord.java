package Home_Works.HomeWork6;

import java.util.Scanner;

public class squareWord {
    public static void main(String[] args) {
        System.out.println(getSquareWord());
    }

    public static String getStringFromScanner() {
        System.out.println("Get your code please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getSquareWord(){
        String str = getStringFromScanner();
        int len = str.length();
        String result = "";

        StringBuffer sb;

        for (int i = 0; i < len; i++)
        {
            sb = new StringBuffer();
            int j = i;
            int k = 0;
            for (int k2 = j; k2 < str.length(); k2++) {
                sb.insert(k, str.charAt(j));
                k++;
                j++;
            }
            j = 0;
            while (j < i)
            {
                sb.insert(k, str.charAt(j));
                j++;
                k++;
            }
            result += sb + " ";
        }
        return result;
    }
}
