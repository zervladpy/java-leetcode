import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    private RomanToInteger sol;

    @Before
    public void setUp() throws Exception {
        sol = new RomanToInteger();
    }

    @Test
    public void test_roman_to_integer_1() {
        String roman = "III";
        int expected = 3;
        int actual = sol.romanToInt(roman);

        assertEquals(expected, actual);
    }

    @Test
    public void test_roman_to_integer_2() {
        String roman = "LVIII";
        int expected = 58;
        int actual = sol.romanToInt(roman);

        assertEquals(expected, actual);
    }

    @Test
    public void test_roman_to_integer_3() {
        String roman = "MCMXCIV";
        int expected = 1994;
        int actual = sol.romanToInt(roman);

        assertEquals(expected, actual);
    }

    @Test
    public void test_roman_to_integer_4() {
        String roman = "IM";
        int expected = 999;
        int actual = sol.romanToInt(roman);

        assertEquals(expected, actual);
    }

}
