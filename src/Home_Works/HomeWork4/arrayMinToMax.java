package Home_Works.HomeWork4;

public class arrayMinToMax {
    public static void main(String[] args) {
        int[] arr = {5123123,412,0,241231,1,2};
        int[] arrSorted;
        for(int i=0;i<arr.length;i++){
            for(int k=0;k<arr.length; k++){
                if(arr[k]<arr[arr.length - 1 - i]) {
                    System.out.println(arr[k] + " " + arr[i]);
                }
            }
        }
    }
}
