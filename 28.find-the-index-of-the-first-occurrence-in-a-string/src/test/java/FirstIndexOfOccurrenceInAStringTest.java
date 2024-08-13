import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstIndexOfOccurrenceInAStringTest {

    private FirstIndexOfOccurrenceInAString sol;

    @Before
    public void setUp() {
        sol = new FirstIndexOfOccurrenceInAString();
    }

    @Test
    public void first_index_of_occurrence_in_a_string_test_1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        int expected = 0;
        int actual = sol.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

    @Test
    public void first_index_of_occurrence_in_a_string_test_2() {
        String haystack = "leetcode";
        String needle = "leeto";
        int expected = -1;
        int actual = sol.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

}
