package Home_Works.HomeWork4;

public class arrayMinValue {
    public static void main(String[] args) {
        int[] arr = {5123123,412,0,241231,1,2};
        int result = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<result){
                    result = arr[i];
            }
        }
        System.out.println(result);
    }
}
