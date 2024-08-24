package ex_180824_CollectionFramework;

import java.util.ArrayList;

public class ArrayList_002 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // Adding data.................
        list.add("Milk");
        list.add("Bread");
        list.add("Banana");
        list.add("Curd");
        list.add("Apple");
        System.out.println(list.size());
        System.out.println(list);

        // search data.......
     //   list.contains(1);

        // clear data
       // list.clear();

        // add data  at index position....
        list.set(1,"Butter");
        System.out.println(list);

        // Removing data................
        list.remove("Milk");
        System.out.println(list.size());
        System.out.println(list);

        // adding dynamic data different data type......
        list.add(123);
        list.add(true);
        System.out.println(list.size());
        System.out.println(list);


    }
}
