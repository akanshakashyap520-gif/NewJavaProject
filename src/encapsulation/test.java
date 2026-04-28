package encapsulation;

public class test {
    public static void main (String[] args) {
        XYZ obj = new XYZ();
        obj.dostuff();
        obj.dosome();
        obj.dosomthing();

        ABC obj1 = new XYZ();
        obj1.dostuff(); // child class method called
        obj1.dosomthing();
    }
}
