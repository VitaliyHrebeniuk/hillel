package Home_Works.HomeWork3;

import java.util.Scanner;

public class DiscountAmount {
    public static void main(String[] args) {
        double discount = discountAmount();
        if (discount == 0){
            System.out.println("You don't have a discount");
        }else{
            System.out.println("Your price with discount is " + discount);
        }
    }
    public static int getIntFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your cost");
        return scanner.nextInt();
    }
    public static double discountAmount(){
         int price = getIntFromScanner();
        if(price>1000){
            double discount_percent = 15;
            double discount_value = price * discount_percent / 100;
            double new_price = price - discount_value;
            return new_price;
        }else{
            return 0;
        }
    }
}
