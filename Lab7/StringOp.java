import java.util.*;

public class StringOp {
    
    private static String reverseString(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }

    
    private static String changeCase(String str1) {
        StringBuilder sb = new StringBuilder(str1);
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            } else {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        String upper = input.toUpperCase();
        String lower = input.toLowerCase();

        System.out.println("Enter the string to insert");
        String input2 = scanner.nextLine();
        String conCat = input.concat(input2);
        boolean res = isPalindrome(input);

        System.out.println("Enter the character to find");
        String input3 = scanner.nextLine();

        System.out.println("String reversed: " + reversed);
        System.out.println("String in uppercase: " + upper);
        System.out.println("String in lowercase: " + lower);
        System.out.println("Concatenated String: " + conCat);
        System.out.println(res ? "String is a Palindrome" : "String is not a Palindrome");
        System.out.println("Changed case: " + changeCase(input));

        scanner.close();
    }
}
