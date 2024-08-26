package ex_180824_CollectionFramework.Set;

import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet_ {
    public static void main(String[] args) {
        // in linked hash order - sorting in order(order maintained)
        Set lhs = new java.util.LinkedHashSet(); // LinkedHashSet-> order is maintained
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("WaterLemon");
        System.out.println(lhs);

        // how can print set
        for(Object s: lhs){
            System.out.println(s);
        }
        System.out.println("--------------------");

        // by using iterator print element value
        Iterator it = lhs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());


        }


    }
}
