import java.util.Scanner;

public class UseCase10AdvancedPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String processed = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(processed).reverse().toString();
        System.out.println(processed.equals(reversed) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
