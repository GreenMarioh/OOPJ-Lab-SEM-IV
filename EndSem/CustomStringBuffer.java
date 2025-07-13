import java.lang.*;

public class CustomStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, World!");
        System.out.println("Original: " + sb.toString());

        // Append
        sb.append(" How are you?");
        System.out.println("After append: " + sb.toString());

        // Insert
        sb.insert(7, "Java ");
        System.out.println("After insert: " + sb.toString());

        // Replace
        sb.replace(7, 11, "Python");
        System.out.println("After replace: " + sb.toString());

        // Delete
        sb.delete(7, 13);
        System.out.println("After delete: " + sb.toString());

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());
        sb.reverse();
        System.out.println("After reverse again: " + sb.toString());

        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb.toString());

        sb.trimToSize();
        System.out.println("After trimToSize: " + sb.toString());

        StringBuilder sb2 = new StringBuilder("LMAO LMAO LMAO LMAO");
        sb2.trimToSize();
        System.out.println("After trimToSize: " + sb2.toString());

    }
}
