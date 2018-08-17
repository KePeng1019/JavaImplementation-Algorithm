package implementation;

/**
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * <p>
 * 说明：不允许修改给定的链表。
 * <p>
 * 进阶：
 * 你是否可以不用额外空间解决此题？
 */

//LinkedList definition
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (null == head || null == head.next) {
            return null;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (slow != fast) {
            slow = slow.next;
            if (null != fast && null != fast.next) {
                fast = fast.next.next;
            } else {
                // no circle, return null
                return null;
            }
        }
        // find a circle, go to first node into circle
        while (head != fast) {
            head = head.next;
            fast = fast.next;
        }
        return head;
    }
}
