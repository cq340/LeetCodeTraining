package leetcode;

public class LinkMergeSort {
    /*
　　　　 1.归并排序思想
	 	2.找到中间节点
	 	3.进行归并排序
　　　　*/
    public static ListNode sortList(ListNode head) {
        return head == null ? head : mergeSort(head);
    }

    //归并
    private static ListNode mergeSort(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode sign = null;
        while (fast.next != null) {
            sign = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        sign.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(slow);
        return merge(left, right);
    }

    //合并两个链表
    public static ListNode merge(ListNode left, ListNode right) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (left != null && right != null)  
        if (left != null) {
            cur.next = left;
        }
        if (right != null) {
            cur.next = right;
        }
        return dummyHead.next;
    }
}
