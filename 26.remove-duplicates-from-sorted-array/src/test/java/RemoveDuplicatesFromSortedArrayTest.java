import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray sol;

    private static void test(int expected, int actual, int[] expectedArray, int[] nums) {
        assertEquals(expected, actual);

        for (int i = 0; i < expected; i++) {
            assertEquals(expectedArray[i], nums[i]);
        }
    }

    @Before
    public void setUp() {
        sol = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    public void remove_duplicates_from_sorted_array_test_1() {
        int[] nums = new int[]{1, 1, 2};
        int[] expectedArray = new int[]{1, 2};
        int expected = 2;
        int actual = sol.removeDuplicates(nums);

        test(expected, actual, expectedArray, nums);

    }

    @Test
    public void remove_duplicates_from_sorted_array_test_2() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedArray = new int[]{0, 1, 2, 3, 4};
        int expected = 5;
        int actual = sol.removeDuplicates(nums);

        test(expected, actual, expectedArray, nums);

    }


}
