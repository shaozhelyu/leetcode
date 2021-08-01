import java.util.*;

public class BTOrder {
    public BTOrder(){}
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> out = new ArrayList<>();
        Queue<TreeNode> level = new LinkedList<>();
        level.add(root);
        while(!level.isEmpty()){
            List<Integer> t = new ArrayList<>();
            Queue<TreeNode> temp = new LinkedList<>();
            while(!level.isEmpty()){
                TreeNode tn = level.poll();
                t.add(tn.val);
                if(tn.left!=null){
                    temp.add(tn.left);
                }
                if(tn.right!=null){
                    temp.add(tn.right);
                }
//                temp.add(tn.right);
            }
            out.add(t);
            level = temp;
        }
        return out;
    }

}
