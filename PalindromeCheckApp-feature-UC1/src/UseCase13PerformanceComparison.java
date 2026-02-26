import java.util.Scanner;
import java.util.Stack;

public class UseCase13PerformanceComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        long start = System.nanoTime();
        stringReverse(str);
        long end = System.nanoTime();
        System.out.println("String Reverse: " + (end - start) + " ns");

        start = System.nanoTime();
        stackMethod(str);
        end = System.nanoTime();
        System.out.println("Stack Method: " + (end - start) + " ns");

        start = System.nanoTime();
        recursiveMethod(str, 0, str.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursive Method: " + (end - start) + " ns");

        sc.close();
    }

    static boolean stringReverse(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        return str.equals(reversed.toString());
    }

    static boolean recursiveMethod(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursiveMethod(str, start + 1, end - 1);
    }
}
