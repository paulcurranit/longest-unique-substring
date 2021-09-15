import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringTest {

    @Test
    public void testOne() {
        int result = LongestSubstring.execute("abcabcbb");
        assertEquals(result, 3);
    }

    @Test
    public void testTwo() {
        int result = LongestSubstring.execute("bbbbb");
        assertEquals(result, 1);
    }

    @Test
    public void testThree() {
        int result = LongestSubstring.execute("pwwkew");
        assertEquals(result, 3);
    }
}
