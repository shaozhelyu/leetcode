import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class palin {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        while(head!=null){
            s.add(head.val);
            q.add(head.val);
            head = head.next;
        }
        while(!s.empty()&&!q.isEmpty()){
            if(s.pop()!=q.poll()){
                return false;
            }
        }
        return true;
    }
}
