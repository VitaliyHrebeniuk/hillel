package Home_Works.HomeWork4;

import java.util.Arrays;

public class reverseArray {
    public static  void main(String[] args) {
        int[] arrInt = {1, 2, 3, 4, 5};
        String[] arrStr = {"one", "two", "three", "four"};
        System.out.println(Arrays.toString(arrIntReverse(arrInt)));
    }

    public static int[] arrIntReverse(int[] arrInt){
        int[] arrIntReverse = new int[arrInt.length];
        for(int i=0;i<arrInt.length;i++){
            //5-1-0=4(5); 5-1-1=3(4); 5-1-2=2(3); 5-1-3=1(); 5-1-4=0;
            arrIntReverse[i] = arrInt[arrInt.length - 1 - i];
        }
        return arrIntReverse;
    }
}
