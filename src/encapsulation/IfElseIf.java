package encapsulation;

public class IfElseIf {
    public static void main(String[] args) {
//        int a = 10;
//        if (a % 2 == 0) {
//            System.out.println("Number is even");
//        }
//        else {
//            System.out.println("number is odd");
//        }


//        int age = 19;
//        if (age >= 18) {
//            System.out.println("Eligible for vote");
//        }
//        else {
//            System.out.println("Not Eligible for vote");
//        }

//        int a = 10;
//        int b = 15;
//        int c = 25;
//        if (a > b)  {
//            if (a > c)
//            System.out.println("a is greater than b and c");
//        }
//        if (b > c) {
//            if (b > a)
//                System.out.println("b is greater than a and c");
//        }
//        else {
//            System.out.println("c is greater than a and b");
//        }

//        if (a > b) {
//            if (a > c) {
//                System.out.println("a is largest");
//            } else {
//                System.out.println("c is largest");
//            }
//        } else {
//            if (b > c) {
//                System.out.println("b is largest");
//            } else {
//                System.out.println("c is largest");
//            }
//        }

        int num = 8;
        if (num > 0) {
            if (num % 2 ==0) {
                System.out.println("positive and even");
            } else {
                System.out.println("positive and odd");
            }
        }
        else {
            System.out.println("no positive");
        }

    }
}

