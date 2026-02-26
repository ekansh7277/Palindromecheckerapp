import java.util.Scanner;

public class UseCase11OOPPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        PalindromeService service = new PalindromeService();
        System.out.println(service.isPalindrome(str) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
