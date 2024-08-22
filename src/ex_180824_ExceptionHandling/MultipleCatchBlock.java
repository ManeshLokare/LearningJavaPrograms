package ex_180824_ExceptionHandling;

import java.sql.SQLOutput;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        String s = null;
        try{
        System.out.println(s.length());
        }
        catch (ArithmeticException e) {
            System.out.println("Handle Exception");
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("Handle Exception");
            System.out.println(e.getMessage());        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Handle Exception");
            System.out.println(e.getMessage());        }




    }




}
