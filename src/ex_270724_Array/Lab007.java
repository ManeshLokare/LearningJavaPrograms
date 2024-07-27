package ex_270724_Array;

public class Lab007 {
    public static void main(String[] args) {
        // 2 dimensional array (2D Array)
        int [] [] array_2d ={
                {10,20,30},
                {40,50,60}
        };
        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.println("Array is "+array_2d[i][j]);
            }
        }
    }
}
