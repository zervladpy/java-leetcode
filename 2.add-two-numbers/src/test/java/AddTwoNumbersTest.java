import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {

    private AddTwoNumbers sol;

    @Before
    public void setUp() {
        sol = new AddTwoNumbers();
    }

    @Test
    public void add_two_numbers_test_1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode actual = sol.addTwoNumbers(l1, l2);

        assertEquals(expected, actual);
    }

    @Test
    public void add_two_numbers_test_2() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        ListNode actual = sol.addTwoNumbers(l1, l2);

        assertEquals(expected, actual);
    }

}
