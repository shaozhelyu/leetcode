import java.util.LinkedList;
import java.util.Queue;

public class Symmetric {
    public Symmetric(){}
    public boolean isSymmetric(TreeNode root) {
        return dp(root,root);
    }
    public boolean dp(TreeNode left,TreeNode right){
        if(left==null&&right==null){return true;}
        if(left==null&&right!=null){return false;}
        if(left!=null&&right==null){return false;}
        if(left.val==right.val){
            return dp(left.left,right.right)&&dp(left.right,right.left);
        }//else{return false;}
        return false;
    }
//    public boolean isSymmetric(TreeNode root) {
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//        q.add(root);
//        while(!q.isEmpty()){
//            TreeNode t1 = q.poll();
//            TreeNode t2 = q.poll();
//            if(t1==null&&t2==null) continue;
//            if(t1==null||t2==null){return false;}
//            if(t1.val!=t2.val) return false;
//            q.add(t1.left);
//            q.add(t2.right);
//            q.add(t1.right);
//            q.add(t2.left);
//        }
//        return true;
//    }
}
