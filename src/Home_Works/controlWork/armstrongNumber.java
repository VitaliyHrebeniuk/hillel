package Home_Works.controlWork;

import java.util.Scanner;

public class armstrongNumber {
    public String getArmstronNumber(){
        String review = getStringFromScanner();
        review = review.replaceAll("[A-Za-z]", "");
        if(review.length()>0) {
            int num, number, temp, total = 0;
            num = Integer.parseInt(review);
            number = num;
            for (; number != 0; number /= 10) {
                temp = number % 10;
                total = total + temp * temp * temp;
            }

            if (total == num)
                return (num + " is an Armstrong number");
            else
                return (num + " is not an Armstrong number");
        }else {
            return "Write ONLY INTEGER!!!!";
        }
    }

    private String getStringFromScanner() {
        System.out.println("Get your number please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
