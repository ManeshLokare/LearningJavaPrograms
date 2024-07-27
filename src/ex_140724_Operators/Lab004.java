package ex_140724_Operators;

public class Lab004 {
    public static void main(String[] args) {
        // increment(++) and decrement(--)operators
        // pre increment (++operant)....1st increase old value then assigned new value
          int a=10;
          int b= ++a;
        System.out.println("value of a: "+ a);
        System.out.println("value of b: "+ b);

        // post increment (operant++)...1st assigned old value then increment old value
        int c=20;
        int d= c++;
        System.out.println("value of c: "+ c);
        System.out.println("value of d: "+ d);

        // pre decrement (--operant)....1st decrease old value then assigned new value
        int e=10;
        int f = --e;
        System.out.println("value of e: "+ e);
        System.out.println("value of f: "+ f);

        // post decrement (operant++)...1st assigned old value then decrement old value
        int g=20;
        int h = g--;
        System.out.println("value of g: "+ g);
        System.out.println("value of h: "+ h);





    }
}
