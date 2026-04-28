package ComCollectionFrameWork;

import java.util.HashSet;

public class SetHashDemo {
    public static void main (String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Akku");
        set.add("Rahul");
        set.add("Java");
        set.add("Java");
        set.add("Python");
        set.add("Akanaksha");
        set.add("Mahi");
        set.add("Mahi");
        set.add("Mohan");

        set.remove("Mahi");
        //set.clear();
        //set.set(5, 100);

//        for (int n : list){
//            System.out.println(n);
//        }


        //System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains("Python"));
        System.out.println(set.isEmpty());
        //System.out.println(list.size());
        //System.out.println(list.indexOf(4));
    }
}
