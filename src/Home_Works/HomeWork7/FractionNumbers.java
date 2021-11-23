package Home_Works.HomeWork7;

public class FractionNumbers {
    static int first_number;
    static int second_number;
    static String method;

    public FractionNumbers(int first_number, int second_number, String method) {
        this.first_number = first_number;
        this.second_number = second_number;
        this.method = method;
    }

    @Override
    public String toString(){
        if(method.equals("plus")) {
            return "" + plus(first_number, second_number);
        }else if(method.equals("minus")){
            return "" + minus(first_number, second_number);
        }else if(method.equals("multiply")){
            return "" + multiply(first_number, second_number);
        }else if(method.equals("divide")){
            return "" + divide(first_number, second_number);
        }else{
            return "Wrong method!";
        }
    }

    public static int plus(int first_number, int second_number){return first_number + second_number;}
    public static int minus(int first_number, int second_number){return first_number - second_number;}
    public static int multiply(int first_number, int second_number){return first_number * second_number;}
    public static int divide(int first_number, int second_number){return first_number / second_number;}



}
