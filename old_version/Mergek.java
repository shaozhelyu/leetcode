import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Mergek {
    public Mergek(){}

    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> cmp = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode l1, ListNode l2) {
                return l1.val-l2.val;
            }
        };
        PriorityQueue<ListNode> PQ = new PriorityQueue<ListNode>(cmp);
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                PQ.offer(lists[i]);
            }

        }
        ListNode head = new ListNode(0);
        ListNode p = head;
        while(!PQ.isEmpty()){
            p.next = PQ.poll();
            p=p.next;
            ListNode next = p.next;
            if(next!=null){
                PQ.offer(next);
            }
        }
        return head.next;
    }
}
