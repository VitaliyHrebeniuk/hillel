package Home_Works.HomeWork5;

public class sumOfArray {
    public static void main(String[] args) {
        int[] intArray = { 5,5,5,5 };
        System.out.println(getArrayLength(intArray));
    }

    public static int getArrayLength(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length;i++){
            sum = sum + array[i];
        }
        return sum;
    }
}


