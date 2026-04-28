package ComCollectionFrameWork;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ListDemo {
    public static void main (String[] args) {
        //ArrayListDemo

        ArrayList<String> list = new ArrayList<>();
        list.add ("Akku");
        list.add ("Rahul");
        list.add ("Love");
        list.add ("Akku");
        list.add ("Rahul");
        list.add ("Love");
        list.add("Akku");
        list.add("Rahul");
        list.add("Love");

        list.set(5, "Mahi");

//        for (String s : list) {
//            System.out.println(s);
//
//        }

        //list.remove(5);
        //list.clear();
        //list.remove(String.valueOf("Akku"));

        //System.out.println(list.size());
        System.out.println(list.indexOf("Rahul"));
        //System.out.println(list.contains("Love"));
        //System.out.println(list.isEmpty());
        //System.out.println(list.getFirst());
        //System.out.println(list.get(5));


//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(10);
//
//        list.remove(Integer.valueOf(10));
//
//        System.out.println(list);
    }


}
