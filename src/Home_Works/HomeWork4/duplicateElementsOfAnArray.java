package Home_Works.HomeWork4;

import java.util.Arrays;

public class duplicateElementsOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println(duplicate(arr));
    }
    public static String duplicate(int[] arr){
        String result = "";
        for (int i=0;i<arr.length;i++){
            for (int k=i+1;k<arr.length;k++){
                if (arr[k] == arr[i]){
                    result = ( result + arr[k] + " ");
                }
            }
        }return result;
    }
}
