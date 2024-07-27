package ex_270724_Array;

import java.sql.SQLOutput;

public class Lab002 {
    public static void main(String[] args) {
        // declaration of array by using new keyword
      //   int [] marks = {10,20,30};   OR ->
         int [] marks = new int[3];
         marks[0]=10;
         marks[1]=20;
         marks[2]=30;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        for (int i = 0; i < marks.length ; i++) {
          //  System.out.println(i);
            System.out.println("At Index "+ i +" Values is "+ marks[i]);
        }
    }
}
