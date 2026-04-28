package encapsulation;

public class Demo {

    public static void main(String[] args) {
        //Person ps = new Person("Akku", 35, 'F');
        //String str = ps.doStuff();
        //System.out.println(str);

        Person1 p1 = new Person1();
        System.out.println(p1.doStuff());

        p1.setName("Akku-1");
        p1.setAge(36);
        p1.setGender('F');


    }
}
