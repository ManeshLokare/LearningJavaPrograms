package ex_270724_String;

public class String_Buffer_Builder {
    public static void main(String[] args) {
        // String has 2 classes -> StringBuffer  & StringBuilder
       //  Both classes are mutable in nature -> can change values
        StringBuffer stringBuffer= new StringBuffer("Manesh");
        stringBuffer.append("Lokare");
        System.out.println(stringBuffer); // ManeshLokare

       //  StringBuilder faster than StringBuffer

        StringBuilder stringBuilder= new StringBuilder("Ganesh");
        stringBuilder.append("Lokare");
        System.out.println(stringBuilder); // GaneshLokare
    }
}
