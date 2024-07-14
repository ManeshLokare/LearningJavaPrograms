package ex_140724;

public class Lab005 {
    public static void main(String[] args) {
        //ternary operator......return type is boolean(true or false)
        // ? if true do this:else do that
       boolean result1= (10>20)? true:false;
        System.out.println(result1);
        int result2= (10>20)? 10:20;
        System.out.println(result2);
     // find maximum and minimum between two number
        int a=50;
        int b =60;
        int max= a>b?a:b;
        int min= a<b?a:b;
        System.out.println("maximum number: "+ max);
        System.out.println("minimum number: "+ min);



    }
}
