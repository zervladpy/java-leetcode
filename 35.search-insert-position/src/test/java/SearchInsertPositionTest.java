import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertPositionTest {

    private SearchInsertPosition sol;

    @Before
    public void setUp() {
        sol = new SearchInsertPosition();
    }

    @Test
    public void search_insert_position_test_1() {
        int[] input = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;
        int actual = sol.searchInsert(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void search_insert_position_test_2() {
        int[] input = {1, 3, 5, 6};
        int target = 2;
        int expected = 1;
        int actual = sol.searchInsert(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void search_insert_position_test_3() {
        int[] input = {1, 3, 5, 6};
        int target = 7;
        int expected = 4;
        int actual = sol.searchInsert(input, target);

        assertEquals(expected, actual);
    }
}
