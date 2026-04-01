import java.util.Scanner;

public class PracticeSet1 {
    public static void main(String[] args) {
        //Ques 1 -- Sum of two numbers ?
//        int A = 4;
//        int B = 5;
//        int sum = A + B;
//        System.out.println(sum);

        //Ques 2 -- Calculate CGPA marks ?
//        float Sub1 = 70;
//        float Sub2 = 85;
//        float Sub3 = 62;
//        Float cgpa = (Sub1+Sub2+Sub3)/30;
//        System.out.println(cgpa);

        //Ques 3 -- Ask User Name & write Greeting ?
//        System.out.println("Please Enter Your Name :-");
//        Scanner New = new Scanner(System.in);
//        String name= New.next();
//        System.out.print(name);
//        System.out.print(" Have a Good day!");

        //Ques 4 -- Enter your number & check it's in int or not ?
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Number :- ");
        String str = sc.next();
        boolean flag = sc.hasNextInt();
        System.out.println(flag +" you've entered "+ str);
    }
}
