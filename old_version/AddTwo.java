import javax.swing.*;

public class AddTwo {
    public AddTwo() {}

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode DH = new ListNode(0);
        ListNode p = l1,q = l2, curr = DH;
        int carry = 0;
        while (p!=null || q!=null){
            int x = (p!=null)?p.val:0;
            int y = (q!=null)?q.val:0;
            int sum = carry+x+y;
//            System.out.println(sum);
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if (p!=null) p = p.next;
            if (q!=null) q = q.next;
        }
        if (carry>0){
            curr.next = new ListNode(carry);
        }
        return DH.next;
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(0);
        ListNode p = l1;
        ListNode l2 = new ListNode(0);
        ListNode q = l2;
        int[] i1 = {3,4,2};
        int[] i2 = {4,6,5};
        for (int i=0;i<2;i++){
            l1.next = new ListNode(i1[i]);
            l1 = l1.next;
            l2.next = new ListNode(i2[i]);
            l2 = l2.next;
        }
        l1.next = new ListNode(i1[2]);
        l2.next = new ListNode(i2[2]);
//        System.out.println(p.val);
        AddTwo AT = new AddTwo();
        ListNode B = AT.addTwoNumbers(p.next,q.next);
//        ListNode B = p;
        while (B!=null){
            System.out.println(B.val);
            B=B.next;
        }
    }
}
