import java.util.Scanner;

public class UseCase12StrategyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Select algorithm: 1-String Reverse, 2-Stack");
        int choice = sc.nextInt();
        StrategyContext context = new StrategyContext();
        if (choice == 1) {
            context.setStrategy(new StringReverseStrategy());
        } else {
            context.setStrategy(new StackStrategy());
        }
        System.out.println(context.execute(str) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
