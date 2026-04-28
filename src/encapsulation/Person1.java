package encapsulation;

public class Person1 {
    String name;
    int age;
    char gender;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public char getGender(){
        return this.gender;
    }

    String doStuff(){
        System.out.println("hello doStuff from person1 class");
        return "hello "+ getName();
    }

}
