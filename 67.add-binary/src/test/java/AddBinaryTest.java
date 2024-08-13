import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryTest {

    private AddBinary sol;

    @Before
    public void setUp() {
        sol = new AddBinary();
    }

    @Test
    public void add_binary_test_1() {
        String a = "11";
        String b = "1";
        String expected = "100";
        String actual = sol.addBinary(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void add_binary_test_2() {
        String a = "1010";
        String b = "1011";
        String expected = "10101";
        String actual = sol.addBinary(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void add_binary_test_3() {
        String a = "01010";
        String b = "10110";
        String expected = "100000";
        String actual = sol.addBinary(a, b);

        assertEquals(expected, actual);
    }

}
