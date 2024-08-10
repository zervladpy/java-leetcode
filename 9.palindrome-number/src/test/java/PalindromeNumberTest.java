import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeNumberTest {

    private PalindromeNumber sol;

    @Before
    public void setUp() throws Exception {
        sol = new PalindromeNumber();
    }

    @Test
    public void palindrome_number_test_1() {
        int input = 121;
        boolean expected = true;
        boolean actual = sol.isPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    public void palindrome_number_test_2() {
        int input = -121;
        boolean expected = false;
        boolean actual = sol.isPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    public void palindrome_number_test_3() {
        int input = 10;
        boolean expected = false;
        boolean actual = sol.isPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    public void palindrome_number_test_4() {
        int input = 121;
        boolean expected = true;
        boolean actual = sol.isPalindromeWithOutString(input);

        assertEquals(expected, actual);
    }

    @Test
    public void palindrome_number_test_5() {
        int input = -121;
        boolean expected = false;
        boolean actual = sol.isPalindromeWithOutString(input);

        assertEquals(expected, actual);
    }

    @Test
    public void palindrome_number_test_6() {
        int input = 10;
        boolean expected = false;
        boolean actual = sol.isPalindromeWithOutString(input);

        assertEquals(expected, actual);
    }

}
