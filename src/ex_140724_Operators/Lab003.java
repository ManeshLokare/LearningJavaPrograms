package ex_140724_Operators;

public class Lab003 {
    public static void main(String[] args) {
        // type casting
        // implicit casting.....smaller data type to bigger data type....(widening) done by JVM
        byte b=10;
        int i=b;
        System.out.println(i);

        // Explicit casting.....bigger data type to smaller data type.....(narrowing) done by manually
       int i1=200;
       byte b1= (byte) i1;     // data type var_name= data type var_name
        System.out.println(b1);







    }
}
