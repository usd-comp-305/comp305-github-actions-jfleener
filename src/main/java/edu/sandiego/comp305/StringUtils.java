package edu.sandiego.comp305;

public class StringUtils {

    private StringUtils(){
        throw new AssertionError("StringUtils cannot be instantiated");
    }

    public static String reverseString(final String input){
        return new StringBuilder(input).reverse().toString();
    }
}
