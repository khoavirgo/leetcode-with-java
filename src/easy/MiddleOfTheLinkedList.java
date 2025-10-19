package easy;

import utils.ListNode;

// 876. Middle of the Linked List
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;

        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int halfLength = length / 2;
        while (halfLength > 0) {
            head = head.next;
            halfLength--;
        }

        return head;
    }
}

//class Solution {
//    public ListNode middleNode(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next; // fast node jumps two steps each iterate
//            slow = slow.next; // slow node jumps one step each iterate
//        }
//
//        return slow;
//    }
//}
