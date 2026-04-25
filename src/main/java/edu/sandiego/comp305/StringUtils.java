package edu.sandiego.comp305;

public class StringUtils {

    private StringUtils() {}

    public static String reverseString(final String input) {
        if (input == null) {
            return null;
        }
        if (input.isEmpty()) {
            return "";
        }
        if (input.length() == 1) {
            return input;
        }
        return new StringBuilder(input).reverse().toString();
    }
}
