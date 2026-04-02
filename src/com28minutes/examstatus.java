package com28minutes;
import java.util.Scanner;

public class examstatus {
    public static void main(String[] args) {
        // In this case, a student is considered to have passed the exam
        // if they have scored more than 50 marks.
        // If the student's marks are 50 or less, they are considered to have failed.
//        int marks;
//        Scanner Score = new Scanner(System.in);
//        System.out.print("Please enter the Score");
//        int number = Score.nextInt();
//        if (number > 50) {
//            ;
//            System.out.println("Pass");
//            //return true;
//        }
//
//        else {
//            System.out.println("fail");
//        }

        // Calculate sumofSqure of first n numbres.

        //Scanner Score = new Scanner(System.in);
       //System.out.print("Please enter the Score");
       //int number1 = Score.nextInt();
        int sum = 0;
        for (int i=1; i<=3; i++){
            sum = sum + (i*i);


        }
        System.out.println(sum);
    }

}
