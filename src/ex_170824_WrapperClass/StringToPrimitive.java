package ex_170824_WrapperClass;

import java.sql.SQLOutput;

public class StringToPrimitive {
    public static void main(String[] args) {

        // string to primitive ---> parse() method

       // String s = "Manesh";  // can't convert char into number

       // string ----> int
        String num = "1997";
        int sint = Integer.parseInt(num);
        System.out.println(sint);

        String si1 = "20";
        String si2 = "30";
        System.out.println(si1+si2); // concatenation ....2030
        System.out.println(Integer.parseInt(si1)+Integer.parseInt(si2)); // addition....50
        System.out.println("------------------------------------");

        // string -----> Double
        String sd1 = "30.5";
        String sd2 = "40.5";
        System.out.println(Double.parseDouble(sd1)+Double.parseDouble(sd2));  // 71.0

        // string ---> Boolean
        String sb = "false";
        System.out.println(Boolean.parseBoolean(sb));










    }
}
