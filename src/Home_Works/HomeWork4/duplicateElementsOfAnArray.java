package Home_Works.HomeWork4;

public class duplicateElementsOfAnArray {
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3};
        for (int i=0;i<arr.length;i++){
            for (int k=i+1;k<arr.length;k++){
                if (arr[k] == arr[i]){
                    System.out.println(arr[k]);
                }
            }
        }
    }
}
