public class RemoveDuplicatesFromSortedList {

    public ListNode removeDuplicates(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode temp = head;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }

        }

        return temp;
    }

}
