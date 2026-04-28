package encapsulation;

class ABCD {
    public String name;



    public void doStuff() {
        System.out.println("called doStuff method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class ThisKeywordDemo {
    public static void main(String[] args) {
        ABCD obj = new ABCD();
        String str = obj.name;
        obj.doStuff();
    }
}
