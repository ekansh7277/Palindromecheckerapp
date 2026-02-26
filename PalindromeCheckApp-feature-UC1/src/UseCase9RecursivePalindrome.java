import java.util.Scanner;

public class UseCase9RecursivePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str, 0, str.length() - 1) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }
}
