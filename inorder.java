import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorder {
    public inorder(){}
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        dp(root,res);
//        return res;
//    }
//    public void dp(TreeNode root,List<Integer> res){
//        if(root==null){
//            return;
//        }
//        dp(root.left,res);
//        res.add(root.val);
//        dp(root.right,res);
////        if(root.left!=null){dp(root.left)}
//    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        s.add(root);
        TreeNode temp = root;
        while(temp!=null||!s.isEmpty()){
            while(temp!=null){
                s.push(temp);
                temp = temp.left;
            }
            temp = s.pop();
            res.add(temp.val);
            temp = temp.right;
        }
        return res;
    }
}
