public class RemoveElement {
    public RemoveElement(){}
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            int i =0,j=0;
            ListNode a = head,l = head,r = new ListNode();
            while(l!=null){
                l = l.next;
                i++;
            }
            while(j<i-n){
                r = head;
                head = head.next;
                j++;
            }
            if(n==i){
                return head.next;
            }

            r.next=head.next;
            return a;
        }
    }
}
