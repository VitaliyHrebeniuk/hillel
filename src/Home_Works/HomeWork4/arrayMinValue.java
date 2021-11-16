package Home_Works.HomeWork4;

import java.util.Arrays;

public class arrayMinValue {
    public static void main(String[] args) {
        int[] arr = {5123123, 412, 0, 241231, 1, 2};
        System.out.println(searchMinValue(arr));
    }
    public static int searchMinValue(int[] arr){
        int result = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<result){
                    result = arr[i];
            }
        }
        return (result);
    }
}
