package Home_Works.HomeWork4;

public class charStringReverse {
    public static void main(String[] args) {
        String word = "vitalik";
        System.out.println(reverseString(word));
    }

    public static String reverseString(String word){
        char[] array = word.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i = i - 1) {
            result = result + array[i];
        }
        return result;
        }
    }
