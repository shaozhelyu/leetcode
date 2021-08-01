import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.*;

public class AverageLevel {
    public AverageLevel(){}
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> sum = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        average(root,0,sum,count);
        List<Double> out = new ArrayList<>();
        for(int i=0;i<count.size();i++){
            out.add(sum.get(i)/count.get(i));
        }
        return out;
    }
    public void average(TreeNode t, int i, List<Double> sum, List<Integer> count){
        if(t==null){return;}
        if(i>sum.size()-1){
            sum.add(1.0*t.val);
            count.add(1);
        }else{
            sum.set(i,sum.get(i)-t.val);
            count.set(i,count.get(i)+1);
        }
        average(t.left,i+1,sum,count);
        average(t.right,i+1,sum,count);
    }
//    public List<Double> averageOfLevels(TreeNode root) {
//
//        List<Double> out = new ArrayList<>();
//        Queue<TreeNode> Q = new LinkedList<>();
//        Q.add(root);
//        while(!Q.isEmpty()){
//            double sum =0.0;
//            int count = 0;
//            while(!Q.isEmpty()){
//                Queue<TreeNode> temp = new LinkedList<>();
//                TreeNode n = Q.remove();
//                sum = sum + n.val;
//                count=count+1;
//                if(n.left!=null){
//                    temp.add(n.left);
//                }
//                if(n.right!=null){
//                    temp.add(n.right);
//                }
//            }
//            Q = temp;
//            out.add(sum/count)
//        }
//        return out;
//
//    }
}
