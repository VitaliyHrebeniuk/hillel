package Home_Works.HomeWork13;

import java.util.Scanner;


public class Demo {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Login:");
        String login = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Password:");
        String password = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("confirmPassword:");
        String confirmPassword = scanner.nextLine();

        checkLogInInfo(login,password,confirmPassword);
    }

    private static boolean checkLogInInfo(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!login.matches("^[a-z_]{0,20}$")) {
            throw new WrongLoginException("Incorrect login");
        }
        if (!password.matches("^[a-z_]{0,20}$")|| confirmPassword.matches("^[a-z_]{0,20}$")|| !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Incorrect password");
        }
        return true;
    }
}
