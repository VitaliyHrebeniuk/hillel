package Home_Works.HomeWork7;
import static Home_Works.HomeWork7.FractionNumbers.*;

public class App {
    public static void main(String[] args) {
        int firstNumber = getIntFromScanner();
        int secondNumber = getIntFromScanner1();
        String method = getStringFromScanner();
        FractionNumbers fractionNumbers = new FractionNumbers(firstNumber, secondNumber, method);
        System.out.println(fractionNumbers.toString());
    }
}
