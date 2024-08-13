import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtXTest {

    private SqrtX sol;

    @Before
    public void setUp() {
        sol = new SqrtX();
    }

    @Test
    public void sqrt_x_test_1() {
        int x = 4;
        int expected = 2;
        int actual = sol.mySqrt(x);

        assertEquals(expected, actual);
    }

    @Test
    public void sqrt_x_test_2() {
        int x = 8;
        int expected = 2;
        int actual = sol.mySqrt(x);

        assertEquals(expected, actual);
    }

    @Test
    public void sqrt_x_test_3() {
        int x = 9;
        int expected = 3;
        int actual = sol.mySqrt(x);

        assertEquals(expected, actual);
    }

    @Test
    public void sqrt_x_test_4() {
        int x = 49;
        int expected = 7;
        int actual = sol.mySqrt(x);

        assertEquals(expected, actual);
    }

}
