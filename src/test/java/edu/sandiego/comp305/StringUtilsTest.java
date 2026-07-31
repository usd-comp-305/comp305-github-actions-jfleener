package edu.sandiego.comp305;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

final class StringUtilsTest {

    @Test
    void reverseStringReversesCharacters() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
    }

    @Test
    void reverseStringHandlesEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void reverseStringHandlesSingleCharacter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    void reverseStringPreservesSpacesAndPunctuation() {
        assertEquals("!dlroW olleH", StringUtils.reverseString("Hello World!"));
    }
}
