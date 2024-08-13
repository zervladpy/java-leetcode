import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfLastWordTest {
    private LengthOfLastWord sol;

    @Before
    public void setUp() {
        sol = new LengthOfLastWord();
    }

    @Test
    public void length_of_last_word_test_1() {
        String s = "Hello World";
        int expected = 5;
        int actual = sol.lengthOfLastWord(s);

        assertEquals(expected, actual);
    }

    @Test
    public void length_of_last_word_test_2() {
        String s = "luffy is still joyboy";
        int expected = 6;
        int actual = sol.lengthOfLastWord(s);

        assertEquals(expected, actual);
    }

    @Test
    public void length_of_last_word_test_3() {
        String s = "   fly me   to   the moon  ";
        int expected = 4;
        int actual = sol.lengthOfLastWord(s);

        assertEquals(expected, actual);
    }
}
