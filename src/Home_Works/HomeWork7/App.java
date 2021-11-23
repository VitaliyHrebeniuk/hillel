package Home_Works.HomeWork7;
import static Home_Works.HomeWork7.FractionNumbers.*;

public class App {
    public static void main(String[] args) {
        FractionNumbers fractionNumbers = new FractionNumbers(first_number,second_number,method);
        first_number = fractionNumbers.setFirst_number();
        second_number = fractionNumbers.setSecond_number();
        method = fractionNumbers.setMethod();
        System.out.println(fractionNumbers.toString());
    }

}
