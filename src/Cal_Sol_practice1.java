import java.util.Scanner;
public class Cal_Sol_practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter your marks :- ");
        int Sub1 = sc.nextInt();
        //System.out.println(Sub1);
        int Sub2 = sc.nextInt();
        //System.out.println(Sub2);
        int Sub3 = sc.nextInt();
        //System.out.println(Sub3);
        int Sub4 = sc.nextInt();
        //System.out.println(Sub4);
        int Sub5 = sc.nextInt();
        //System.out.println(Sub5);
        float Total = ((Sub1+Sub2+Sub3+Sub4+Sub5)/500.0f)*100;
        System.out.println("Percentage : ");
        System.out.println(Total);



    }
}
