package edu.sandiego.comp305;

public class StringUtils {

    private StringUtils() {}

    public static String reverseString(final String input) {
        if (input == null) {
            return null;
        }
        // add this so I can submit an open PR link since I accidentally merged the first time
        return new StringBuilder(input).reverse().toString();
    }
}
