package ex_180824_CollectionFramework.List.Stack;

import java.util.Stack;

public class Ex_001 {
    public static void main(String[] args) {
        // Stack is legacy(old) class of vector
        // and its methods are synchronized,
        // so stack objects can’t be accessed by multiple threads at a time.
        //Stack has important operations like peek(), pop(), push(), search()

        Stack s = new Stack();
        s.push("Manesh");
        s.push("Ganesh");
        s.push("Ramesh");
        s.push("Yogesh");
        System.out.println("Element -> "+s);
        System.out.println(s.peek()); // first element can see
        System.out.println(s.pop()); // removing last element
        System.out.println("Element -> "+s);


    }
}
