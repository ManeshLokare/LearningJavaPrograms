package ex_180824_CollectionFramework.Set;

import java.util.Iterator;
import java.util.Set;


public class HashSet_ {
    public static void main(String[] args) {
        // list -> allows duplicate elements
        // Set -> Doesn't allow duplicate elements
        // types of set -> HashSet,linkedHashSet,TreeSet

// HashSet...................

      Set hs = new java.util.HashSet(); // HashSet-> order not maintains
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Orange");
        hs.add("WaterLemon");
        System.out.println(hs);

        System.out.println("--------------------");
        // how can print set
        for (Object s : hs) {
            System.out.println(s);
        }
        System.out.println("--------------------");

        // by using iterator print element value
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());


        }

    }
}
