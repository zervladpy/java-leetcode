public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode dummyHead = new ListNode(0);
        ListNode head = dummyHead;

        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            head.next = new ListNode(sum % 10);
            head = head.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            head.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

}
