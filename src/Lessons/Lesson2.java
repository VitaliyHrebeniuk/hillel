package Lessons;

import java.util.Objects;
import java.util.Scanner;

public class Lesson2{
    public static void main(String[] args) {
//        //1. Is it day or evening? In case time more then 18, show Good evening, otherwise Good day. Try to use IF and Ternary
//        Scanner time = new Scanner(System.in);
//        System.out.println("Eneter time");
//        int usersTime = time.nextInt();
//        if(usersTime > 18 && usersTime < 24){
//            System.out.println("Now is evening");
//        }else if(usersTime > 24){
//            System.out.println("Bad time dude");
//        }else{
//            System.out.println("Now is a day");
//        }
//    }
        //with Ternary
//        Scanner entertime = new Scanner(System.in);
//        System.out.println("Eneter time");
//        int usersTime = entertime.nextInt();
//        String time = (usersTime>18 && usersTime<24)?"Now is  evening" : "Now is a day";
//        System.out.println(time);

//        2.Print name of Weekday according to numbers int. If program gets wrong number, return “Not a valid day”. For example: Enter 1, Print “Monday”
//        Scanner enterDay = new Scanner(System.in);
//        System.out.println("Eneter time");
//        int userDay = enterDay.nextInt();
//        switch (userDay) {
//            case 1:
//                System.out.println("Now is a Monday");
//                break;
//            case 2:
//                System.out.println("Now is a Tuesday");
//                break;
//            case 3:
//                System.out.println("Now is a Wednesday");
//                break;
//            case 4:
//                System.out.println("Now is a Thursday");
//                break;
//            case 5:
//                System.out.println("Now is a Friday");
//                break;
//            case 6:
//                System.out.println("Now is a Saturday");
//                break;
//            case 7:
//                System.out.println("Now is a Sunday");
//                break;
//            default:
//                System.out.println("Bad day dude");
//        }
//    }

//      3. Check length of string, if string more then expected print error
//        Scanner enterString = new Scanner(System.in);
//        System.out.println("Eneter time");
//        String userString = enterString.nextLine();
//        int lenghtUserString = userString.length();
//        int lenght = 2;
//        if (lenght < lenghtUserString){
//            System.out.println("Error");
//        }else{
//            System.out.println(enterString);
//        }
//    }

//      4. Create program that login you in system. Check password length.
//      Example:
//      • Enter your name: Yuriy (in case wrong login print error)
//      • Enter your password: pass (in case wrong pass print error)

//        Scanner enterPassword = new Scanner(System.in);
//        System.out.println("Enter password");
//        int userPassword = enterPassword.nextInt();
//        if (userPassword == 1){ //Узнать что такое equals
//            System.out.println("krasava");
//        }else{
//            System.out.println("Error");
//        }
//    }

//    4. From teacher
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Eneter user name");
//        String userName = scanner.nextLine();
//        String expectedUserName = "Vitalik";
//
//        System.out.print("Eneter user password");
//        String userPassword = scanner.nextLine();
//        String expectedUserPassword = "QWERTy";
//
//        if (!userName.equals(expectedUserName)){
//            System.out.print("Wrong name");
//        }else{
//            System.out.print("It is a right user");
//        }
//
//        if (userPassword.length() == expectedUserPassword.length()){
//            System.out.print("Password is right");
//        }else{
//            System.out.print("wrong password");
//        }
    }
}