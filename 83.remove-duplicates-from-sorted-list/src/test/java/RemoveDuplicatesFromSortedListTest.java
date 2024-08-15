import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromSortedListTest {

    private RemoveDuplicatesFromSortedList sol;

    @Before
    public void setUp() {
        sol = new RemoveDuplicatesFromSortedList();
    }

    @Test
    public void remove_duplicates_from_sorted_list_test_1() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode expected = new ListNode(1, new ListNode(2));
        ListNode actual = sol.removeDuplicates(head);

        assertEquals(expected, actual);
    }

    @Test
    public void remove_duplicates_from_sorted_list_test_2() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode actual = sol.removeDuplicates(head);

        assertEquals(expected, actual);
    }

    @Test
    public void remove_duplicates_from_sorted_list_test_3() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1)));
        ListNode expected = new ListNode(1);
        ListNode actual = sol.removeDuplicates(head);

        assertEquals(expected, actual);
    }

}
