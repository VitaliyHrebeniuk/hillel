package Home_Works.HomeWork4;

public class charStringReverse {
    public static void main(String[] args) {
        String word = "vitalik";
        char[] array = word.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i = i - 1) {
            result = result + array[i];
        }
        System.out.println(result);
        }
    }
