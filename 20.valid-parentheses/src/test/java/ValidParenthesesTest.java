import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {

    private ValidParentheses sol;

    @Before
    public void setUp() {
        sol = new ValidParentheses();
    }

    @Test
    public void valid_parentheses_test_1() {
        String input = "()";
        boolean expected = true;
        boolean actual = sol.isValid(input);

        assertEquals(expected, actual);
    }

    @Test
    public void valid_parentheses_test_2() {
        String input = "()[]{}";
        boolean expected = true;
        boolean actual = sol.isValid(input);

        assertEquals(expected, actual);
    }

    @Test
    public void valid_parentheses_test_3() {
        String input = "(]";
        boolean expected = false;
        boolean actual = sol.isValid(input);

        assertEquals(expected, actual);
    }

    @Test
    public void valid_parentheses_test_4() {
        String input = "]";
        boolean expected = false;
        boolean actual = sol.isValid(input);

        assertEquals(expected, actual);
    }

    @Test
    public void valid_parentheses_test_5() {
        String input = "({[)";
        boolean expected = false;
        boolean actual = sol.isValid(input);

        assertEquals(expected, actual);
    }

}
