import java.util.Scanner;
import java.util.Stack;

public class UseCase5StackPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        System.out.println(str.equals(reversed.toString()) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
