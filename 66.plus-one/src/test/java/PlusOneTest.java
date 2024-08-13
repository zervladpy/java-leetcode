import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {

    private PlusOne sol;

    @Before
    public void setUp() {
        sol = new PlusOne();
    }

    @Test
    public void plus_one_test_1() {
        int[] digits = {1, 2, 3};
        int[] expected = {1, 2, 4};
        int[] actual = sol.plusOne(digits);

        assertArrayEquals(expected, actual);

    }

    @Test
    public void plus_one_test_2() {
        int[] digits = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        int[] actual = sol.plusOne(digits);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void plus_one_test_3() {
        int[] digits = {9};
        int[] expected = {1, 0};
        int[] actual = sol.plusOne(digits);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void plus_one_test_4() {
        int[] digits = {5, 9, 9, 9};
        int[] expected = {6, 0, 0, 0};
        int[] actual = sol.plusOne(digits);

        assertArrayEquals(expected, actual);
    }

}
