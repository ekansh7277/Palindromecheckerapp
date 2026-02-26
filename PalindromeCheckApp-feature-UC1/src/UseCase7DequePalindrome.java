import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class UseCase7DequePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.add(c);
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
