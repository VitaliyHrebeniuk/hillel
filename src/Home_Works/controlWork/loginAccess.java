package Home_Works.controlWork;

import java.util.Scanner;

import static Home_Works.controlWork.variantTasks.getVariantTasks;


public class loginAccess {
    private static String login = getStringFromScanner() ;
    private static String password = getStringFromScanner();

    public static String loginPassword() {
        if (login.equals("admin") && password.equals("admin")) {
            return getVariantTasks();
        } else {
            return "Login or Password Incorect!";
        }
    }

    private static String getStringFromScanner() {
        System.out.println("Enter value please:" );
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
