package ex_180824_CollectionFramework.Generic_;

public class Ex_001 {
    public static void main(String[] args) {

        //  Generic -> homogenous (same) data type of elements.
        //  Non-Generic -> Heterogeneous (different) data type of element.
        // <any reference>  = represent all data type in non-generic


        temp("Manesh");
        // temp(123); -> bcz of data type is string so
        temp(123);
        temp(true);


    }

    public static <T>void temp(T name){
        System.out.println(name);
    }

}
