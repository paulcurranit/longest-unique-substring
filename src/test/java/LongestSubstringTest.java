import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongestSubstringTest {

    @Test
    public void testOne() {
        int result = LongestSubstring.execute("abcabcbb");
        assertTrue(result == 3);
    }

    @Test
    public void testTwo() {
        int result = LongestSubstring.execute("bbbbb");
        assertTrue(result == 1);
    }

    @Test
    public void testThree() {
        int result = LongestSubstring.execute("pwwkew");
        assertTrue(result == 3);
    }
}
