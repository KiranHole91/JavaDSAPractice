package TwoPointers;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class LinkdListHasCycle {
    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4 -> back to 2
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                hasCycle = true;
                break;
            }
        }

        if(hasCycle)
            System.out.println("LinkdList has a cycle");
        else
            System.out.println("No cycle in LinkedList");
    }
}
