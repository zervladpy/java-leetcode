import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeTwoSortedListsTest {

    private MergeTwoSortedLists sol;

    @Before
    public void setUp() {
        sol = new MergeTwoSortedLists();
    }

    @Test
    public void merge_two_sorted_lists_test_1() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        ListNode actual = sol.mergeTwoLists(list1, list2);

        assertEquals(expected, actual);
    }

    @Test
    public void merge_two_sorted_lists_test_2() {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode expected = new ListNode(0, new ListNode(0));
        ListNode actual = sol.mergeTwoLists(list1, list2);

        System.out.println(expected);
        System.out.println(actual);

        assertEquals(expected, actual);
    }

    @Test
    public void merge_two_sorted_lists_test_3() {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode(0);
        ListNode expected = new ListNode(0, new ListNode(0));
        ListNode actual = sol.mergeTwoLists(list1, list2);

        assertEquals(expected, actual);
    }

    @Test
    public void merge_two_sorted_lists_test_4() {
        ListNode list1 = new ListNode(5);
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));

        ListNode actual = sol.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);

    }

}
