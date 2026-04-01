package fundamental;

import java.util.Scanner;

public class ForLoopDemo {

    public static void main(String[] args) {
//    System.out.println("hello World");
//
//    int minValue = Integer.MIN_VALUE;
//        int maxValue = Integer.MAX_VALUE;
//    System.out.println("Integer Minimum Vaulue = " + minValue);
//        System.out.println("Integer Maximum Vaulue = " + maxValue);
//    System.out.print("Int Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")" );
//        System.out.println("Int Range = (" + minValue + ")" );
//        short myminShortValue = Short.MIN_VALUE; int myminIntValue = Integer.MIN_VALUE;
//        System.out.println("Integer Minimum Vaulue = " + myminIntValue + " ,Short Minimum Vaulue = " + myminShortValue );
//        byte bytevalue = 10; short shortvalue = 20; int intvalue = 100;
//        long longtotal = 50000L + 10L;
//        System.out.println(longtotal * (bytevalue + shortvalue + intvalue));


        // task 3 17-03-2026
//        int a = 10; int b = 5; int c = 2;
//        //int d = a + b * c - b / c;
//        System.out.println(d);


//        Scanner Value1 = new Scanner(System.in);
//        System.out.print("Please enter the Value 1");
//        int number = Value1.nextInt();
//        System.out.print("Please enter the Value 2");
//        int number2 = Value1.nextInt();
//        System.out.println((number % 2 == 0 && number2 % 2 == 0));
//        System.out.println(" At Least one number is greater than 50 :"+ (number >= 50) + " " + (number2 >= 50));

        Scanner Value1 = new Scanner(System.in);
        System.out.print("Please enter the Score");
        int number = Value1.nextInt();
        System.out.println(number >= 75 ? "Passed" : " Failed");

    }
}
