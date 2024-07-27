package ex_270724_Array;

public class Lab001 {
    public static void main(String[] args) {
        // Array
        // it is used to store the similar type of data type (Homogenous data)
      //  syntax-> data type [] variable_name = {values};
        // Disadvantages ->
        // Length and data type is fixed can not change
        // wastage of memory
        int [] i = {10,20,30,40,50,60};
         String [] name = {"Manesh","Ganesh","Yogesh","Ramesh", };

        System.out.println("Length of Array is "+ i.length); // 6
        System.out.println("Index Values Is "+i[3]); // 40

        System.out.println("Length of Array is "+ name.length); // 4
        System.out.println("Index Values Is "+name[2]); // Yogesh
    }
}
