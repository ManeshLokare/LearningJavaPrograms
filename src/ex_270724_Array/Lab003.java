package ex_270724_Array;

import java.sql.SQLOutput;

public class Lab003 {
    public static void main(String[] args) {
        // declaration of array by using new keyword
        String week_days [] = {"Sunday","Monday","Tuesday",};
        for (int i = 0; i < week_days.length ; i++) {
            //  System.out.println(i);

            System.out.println("At Index "+ i +" Values is "+ week_days[i]);
        }
    }
}
