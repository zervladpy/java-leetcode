import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {

    private ClimbingStairs sol;

    @Before
    public void setUp() {
        sol = new ClimbingStairs();
    }

    @Test
    public void climb_stairs_test_1() {
        int n = 2;
        int expected = 2;
        int actual = sol.climbStairs(n);

        assertEquals(expected, actual);
    }

    @Test
    public void climb_stairs_test_2() {
        int n = 3;
        int expected = 3;
        int actual = sol.climbStairs(n);

        assertEquals(expected, actual);
    }

    @Test
    public void climb_stairs_test_3() {
        int n = 45;
        int expected = 1836311903;
        int actual = sol.climbStairs(n);

        assertEquals(expected, actual);
    }

}
