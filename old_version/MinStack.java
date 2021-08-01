import java.util.HashMap;
import java.util.Stack;

public class MinStack {
//    HashMap<Integer,Integer> min,s;
//    int min = Integer.MIN_VALUE;
    Stack<Integer> s,min;
//    int count;
    public MinStack() {
        min=new Stack<>();
        s = new Stack<>();
//        this.m = new HashMap<>();
    }
//    public MinStack(int x) {
//
//    }
    public void push(int x) {
        if(min.peek()>=x||min.isEmpty()){
            min.add(x);
        }

        s.add(x);
    }

    public void pop() {
        int x = s.pop();
        if(!min.empty()&&x==min.peek()){min.pop();}
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min.peek();
    }

}
