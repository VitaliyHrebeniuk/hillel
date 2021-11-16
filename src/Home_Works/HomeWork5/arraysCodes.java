package Home_Works.HomeWork5;

import java.util.Arrays;

public class arraysCodes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(arraysValueToCodes(arr));
    }

    public static String arraysValueToCodes(int[] arr) {
        String name = "";
        int[] ascii = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            name += arr[i];
        }
        int nameLenght = name.length();

        for (int i = 0; i < nameLenght; i++) {
            char character = name.charAt(i);
            ascii[i] = character;
        }
        return (Arrays.toString(ascii));
    }
}