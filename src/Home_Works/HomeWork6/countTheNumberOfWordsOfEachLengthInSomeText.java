package Home_Works.HomeWork6;

import java.util.Scanner;

public class countTheNumberOfWordsOfEachLengthInSomeText {
    public static void main(String[] args) {
        System.out.println(countTheWord());
    }

    public static String getStringFromScanner() {
        System.out.println("Get your string please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String countTheWord(){
        int one = 0,two = 0,three = 0,fourth = 0,five = 0,six = 0,seven = 0,eight = 0,nine = 0,ten = 0, eleven = 0, twelve = 0, thirteen = 0, fourteen = 0, fifteen = 0;
        String str = getStringFromScanner();
        String result = "";
        String[] splitString = str.split( " ");
        for(int i=0;i<splitString.length;i++){
            if(splitString[i].length() == 1){
                one ++;
            }else if(splitString[i].length() == 2){
                two ++;
            }else if(splitString[i].length() == 3){
                three ++;
            }else if(splitString[i].length() == 4){
                fourth ++;
            }else if(splitString[i].length() == 5){
                five ++;
            }else if(splitString[i].length() == 6){
                six ++;
            }else if(splitString[i].length() == 7){
                seven ++;
            }else if(splitString[i].length() == 8){
                eight ++;
            }else if(splitString[i].length() == 9){
                nine ++;
            }else if(splitString[i].length() == 10){
                ten ++;
            }else if (splitString[i].length() == 11){
                eleven ++;
            }else if (splitString[i].length() == 12){
                twelve ++;
            }else if (splitString[i].length() == 13){
                thirteen ++;
            }else if (splitString[i].length() == 14){
                fourteen ++;
            }else if (splitString[i].length() == 15){
                fifteen ++;
            }
            result = ("one_letter: " + one + " two_letter: " + two + " three_letter: " + three + " fourth_letter: " + fourth + " five_letter: " + five + " six_letter: " + six + " seven_letter: " + seven + " eight_letter: " + eight + " nine_letter: " + nine + " ten_letter: " + ten + " eleven_letter: " + eleven + " twelve_letter: " + twelve + " thirteen_letter: " + thirteen+ " fourteen_letter: " + fourteen+ " fifteen_letter: " + fifteen);
        }
        return result;
    }
}
