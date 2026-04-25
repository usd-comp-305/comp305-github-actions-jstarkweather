package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTests {

    @Test
    public void testReverseNormal() {
        assertEquals("cba", StringUtils.reverseString("abc"));
    }

    @Test
    public void testReverseEmpty() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    public void testReverseSingleChar() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    public void testReverseNull() {
        assertNull(StringUtils.reverseString(null));
    }

}
