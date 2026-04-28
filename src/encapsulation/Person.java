package encapsulation;

public class Person {
    String name;
    int age;
    char gender;

    Person(String name, int age, char gender){
        System.out.println("hello Person from person class constructor");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    String doStuff(){
        System.out.println("hello doStuff from person class");
        System.out.println("name "+ name+" age "+age+" gender "+gender);
        return "hello "+ name;
    }

}
