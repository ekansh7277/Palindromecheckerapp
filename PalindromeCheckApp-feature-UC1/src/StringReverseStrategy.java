public class StringReverseStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());
    }
}
