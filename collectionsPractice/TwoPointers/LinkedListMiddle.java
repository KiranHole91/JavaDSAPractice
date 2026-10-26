package TwoPointers;

public class LinkedListMiddle {
    /*
     * Problem: Find the middle node of a linked list (if even length, return the second middle)
     */
    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;        // 1 step
            fast = fast.next.next;   // 2 steps
        }

        System.out.println("Middle: " + slow.val);
    }
}
