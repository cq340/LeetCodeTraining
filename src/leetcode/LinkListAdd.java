package leetcode;

import java.util.Stack;

public class LinkListAdd {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while (l1 != null ) {
            stack1.add(l1);
            l1 = l1.next;
        }
        while (l2 != null ) {
            stack2.add(l2);
            l2 = l2.next;
        }
        int ca = 0, n1 = 0, n2 = 0, n = 0;
        ListNode node = null;
        ListNode pre = null;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            n1 = stack1.isEmpty() ? 0 : stack1.pop().val;
            n2 = stack2.isEmpty() ? 0 : stack2.pop().val;
            n = n1 + n2 + ca;
            pre = node;
            node = new ListNode(n % 10);
            node.next = pre;
            ca = n / 10;
        }
        if (ca == 1) {
            pre = node;
            node = new ListNode(1);
            node.next = pre;
        }
        return node;
    }

}
