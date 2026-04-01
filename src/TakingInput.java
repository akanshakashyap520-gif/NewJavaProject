import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from User");
        Scanner Num = new Scanner(System.in);
//        System.out.println("Enter Number 1");
//        //int A = Num.nextInt();
//        float A = Num.nextFloat();
//        System.out.println("Enter Number 2");
//        //int B = Num.nextInt();
//        float B = Num.nextFloat();
//        //int sum = A + B;
//        float sum = A + B;
//        System.out.print("Sum of Number 1 & Number 2 :-");
//        System.out.print(sum);
        String str = Num.next();
        System.out.print(str);
        String str1 = Num.nextLine();
        System.out.print(str1);
    }
}
