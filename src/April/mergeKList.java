package April;

public class mergeKList {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        return mergeByDivision(lists,0,lists.length-1);
    }


    public ListNode mergeByDivision(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[end];
        }
        if (start + 1 == end) {
            return mergeTwoNode(lists[start], lists[end]);
        }
        int mid = (start + end) >>> 1;
        ListNode left = mergeByDivision(lists, start, mid);
        ListNode rightNode = mergeByDivision(lists, mid+1, end);
        return mergeTwoNode(left, rightNode);
    }

    public ListNode mergeTwoNode(ListNode l1, ListNode l2) {

        //迭代
        ListNode head = new ListNode(-1);

        //假的头结点
        ListNode l3=head;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                l3.next=l1;
                l1=l1.next;
            }else{
                l3.next=l2;
                l2=l2.next;
            }
            l3=l3.next;
        }

        l3.next=l1==null?l2:l1;
        return head.next;
    }



}
