package ComCollectionFrameWork;

import java.util.LinkedList;


public class ListLinkedDemo {
    public static void main (String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(10);
        list.add(9);

        list.set(5, 100);

//        for (int n : list){
//            System.out.println(n);
//        }


        //System.out.println(list);
        //System.out.println(list.size());
        System.out.println(list.indexOf(4));

    }


}
