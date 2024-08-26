package ex_180824_CollectionFramework.List.Vector;

import java.util.Vector;

public class Ex_001 {
    public static void main(String[] args) {
        // vector is synchronized
        // its thread safe one by one usage so its time-consuming (slower in nature)
        Vector v = new Vector();
        v.add("Manesh");
        v.add("Ganesh");
        v.add("Ramesh");
        v.add("Yogesh");
        System.out.println(v);





    }
}
