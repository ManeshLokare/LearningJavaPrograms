package ex_180824_CollectionFramework.Set;

import java.util.Iterator;
import java.util.Set;

public class TreeSet_ {
    public static void main(String[] args) {
        // in TreeSet sorting data based on 1st letter
        Set ts = new java.util.TreeSet();  // TreeSet-> Sort based on 1st letter
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterLemon");
        ts.add("Banana");
        System.out.println(ts);

        System.out.println("--------------------");
        // how can print set
        for (Object s : ts) {
            System.out.println(s);
        }
        System.out.println("--------------------");

        // by using iterator print element value
        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
