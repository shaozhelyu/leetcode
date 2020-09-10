import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class lowestAncestor {
    TreeNode temp;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        Stack<TreeNode> stack = new LinkedList<>();
//        TreeNode r = root;
        temp = null;
        HashSet<TreeNode> s = new HashSet<>();
        s.add(p);
        s.add(q);
        dp(root,s);
//        int a = Integer.MIN_VALUE
        return temp;

    }
    public boolean dp(TreeNode node,HashSet<TreeNode> s){
        boolean bl,br,bs=true;
        if(s.contains(node)){
            s.remove(node);
            bs = true;
        }

        bl = dp(node.left,s);
        br = dp(node.right,s);
        if(bl||br&&bs){
            temp = node;
            return false;
        }
        if(bl&&br){
            temp = node;
            return false;
        }
        if(bl||br) return true;
        return false;
    }
}
