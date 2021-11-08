package Home_Works.HomeWork3;

import java.util.Scanner;

public class discountAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter cost: ");
        int price = scanner.nextInt();

        if(price>1000){
            double discount_percent = 15;
            double discount_value = price * discount_percent / 100;
            double new_price = price - discount_value;
            System.out.print("Your price is " + new_price);
        }else{
            System.out.print("You don't have a discount");
        }
    }
}
