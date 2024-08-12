import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    private LongestCommonPrefix sol;

    @Before
    public void setUp() {
        sol = new LongestCommonPrefix();
    }

    @Test
    public void longest_common_prefix_test_1() {
        String[] strs = {"flower", "flow", "flight"};
        String expected = "fl";
        String actual = sol.longestCommonPrefix(strs);

        assertEquals(expected, actual);
    }

    @Test
    public void longest_common_prefix_test_2() {
        String[] strs = {"dog", "racecar", "car"};
        String expected = "";
        String actual = sol.longestCommonPrefix(strs);

        assertEquals(expected, actual);
    }

    @Test
    public void longest_common_prefix_test_3() {
        String[] strs = {"flower", "flow", "flowz", "floz"};
        String expected = "flo";
        String actual = sol.longestCommonPrefix(strs);

        assertEquals(expected, actual);
    }

}
