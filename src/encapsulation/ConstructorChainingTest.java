package encapsulation;

class ConstructorChaining {
    int a = 10;
    String b = " ";

    // This is a default constructor  - with no parameter
    public ConstructorChaining(String str){
        this(10);
        System.out.println("name :" +str);
    }
    // this is a single parametrized constructor
    public ConstructorChaining(int i){
        super();
        System.out.println("num :"+i);
    }
    // this is a 2 parametrized constructor
    public ConstructorChaining(String str, Long num){
        this(str);
        System.out.println("name :"+str + "num : "+ num);
    }

}

public class ConstructorChainingTest{
    static void main(String[] args) {
        ConstructorChaining conObj = new ConstructorChaining("Akku", 100l);
    }

}
