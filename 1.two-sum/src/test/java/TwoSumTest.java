import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    private TwoSum sol;

    @Before
    public void setUp() throws Exception {
        sol = new TwoSum();
    }

    @Test
    public void two_sum_test_1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = sol.twoSum(nums, target);

        Arrays.sort(expected);
        Arrays.sort(actual);

        assertArrayEquals(expected, actual);

    }

    @Test
    public void two_sum_test_2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] actual = sol.twoSum(nums, target);

        Arrays.sort(expected);
        Arrays.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void two_sum_test_3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] actual = sol.twoSum(nums, target);

        Arrays.sort(expected);
        Arrays.sort(actual);

        assertArrayEquals(expected, actual);
    }

}
