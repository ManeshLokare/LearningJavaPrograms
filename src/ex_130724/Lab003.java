package ex_130724;

public class Lab003 {
    public static void main(String[] args) {
        char c1 ='\n'; // add new line
        char c2 ='\t'; // add tab
        char c3 ='\b'; // backlash,delete 1 char
        char c4 = '\r'; // backlash,delete 1 word
        System.out.println("manesh"+c3+"lokare"); //maneslokare
        System.out.println("manesh"+c4+"lokare"); //lokare
        System.out.println("manesh"+c2+"lokare"); //manesh lokare
    }
}
