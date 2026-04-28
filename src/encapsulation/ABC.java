package encapsulation;

public class ABC {
    int i = 10;
    public ABC(){
        this(10);
        //super();
        System.out.println("Constructor from ABC1");
    }
    public ABC(int i){
        //super();
        System.out.println("Constructor from ABC2");
    }
    void dostuff(){
        System.out.println("dostuff from ABC");
    }

    void dosomthing(){
        System.out.println("dosomthing from abc");
    }
}

class XYZ extends ABC{
    int j = 10;
    public XYZ(){
        //super();

        System.out.println("Constructor from XYZ");}

    /*void dostuff(){
        System.out.println("dostuff from XYZ");
    }*/

    void dosome(){
        System.out.println("dosome from XYZ");
    }
}
