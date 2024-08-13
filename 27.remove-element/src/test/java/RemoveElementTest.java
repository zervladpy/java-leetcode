import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest {

    private RemoveElement sol;

    private static void test(int expected, int actual, int[] nums, int[] expectedNums) {
        assertEquals(expected, actual);

        for (int i = 0; i < expected; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }

    }

    @Before
    public void setUp() {
        sol = new RemoveElement();
    }

    @Test
    public void remove_element_test_1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] expectedArr = {2, 2};
        int expected = 2;
        int actual = sol.removeElement(nums, val);
        assert expected == actual;
        test(expected, actual, nums, expectedArr);
    }

    @Test
    public void remove_element_test_2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expectedArr = {0, 1, 3, 0, 4};
        int expected = 5;
        int actual = sol.removeElement(nums, val);

        test(expected, actual, nums, expectedArr);
    }

}
