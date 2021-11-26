package Home_Works.controlWork;

public class fibonacciNumber {
    public static String getfibonacciNumber() {
        int n0 = 1;
        int n1 = 1;
        int n2;
        String result = "";
        for (int i = 3; i <= 11; i++) {
            n2 = n0 + n1;
            if (n2<50) {
                result += n2 + " ";
            }
            n0 = n1;
            n1 = n2;
        }
       return result;
    }
}
