package Home_Works.HomeWork4;

import java.util.Arrays;

public class reverseArray {
    public static  void main(String[] args) {
        int[] arrInt = {1, 2, 3, 4, 5};
        int[] arrIntReverse = new int[arrInt.length];
        String[] arrStr = {"one", "two", "three", "four"};
        String[] arrStrReverse = new String[arrStr.length];
        for(int i=0;i<arrInt.length;i++){
            //5-1-0=4(5); 5-1-1=3(4); 5-1-2=2(3); 5-1-3=1(); 5-1-4=0;
            arrIntReverse[i] = arrInt[arrInt.length - 1 - i];
        }
        for(int i=0;i<arrStr.length;i++){
            //5-1-0=4(5); 5-1-1=3(4); 5-1-2=2(3); 5-1-3=1(2); 5-1-4=0(1);
            arrStrReverse[i] = arrStr[arrStr.length - 1 - i];
        }
        //единственное посмотрел в интернете как распечатать весь масив целиком(понял что это как бы приображение в строку если это так можно назвать)
        System.out.println(Arrays.toString(arrIntReverse));
        System.out.println(Arrays.toString(arrStrReverse));
    }
}
