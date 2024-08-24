package ex_180824_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        // sorting marks using collection build in method.....

        List marks = new ArrayList();
        marks.add(81);
        marks.add(87);
        marks.add(91);
        marks.add(68);
        marks.add(97);
        System.out.println("Before sorting" + marks);
        Collections.sort(marks);
        System.out.println("After sorting" + marks);



    }
}
