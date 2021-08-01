public class merge2list {
    public merge2list(){}
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode c = new ListNode();
        if(l2==null){
            return l1;
        }else if(l1==null){
            return l2;
        }
        if(l1.val < l2.val){
            c = l1;
            l1=l1.next;
        }else{
            c = l2;
            l2 = l2.next;
        }
        ListNode a = c;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                c.next = l1;
                c = c.next;
                l1 = l1.next;
            }else{
                c.next = l2;
                c = c.next;
                l2 = l2.next;
            }
        }
        if(l1!= null){
            c.next = l1;
        }else if(l2!=null){
            c.next = l2;
        }
        return a;
    }
}
