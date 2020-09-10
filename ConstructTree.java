import org.w3c.dom.Node;

import java.util.HashMap;

public class ConstructTree {
    public ConstructTree(){}
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode();
        int len = inorder.length;
        root = cons(inorder,preorder,0,len,0);
        return root;
    }
    public TreeNode cons(int[] inorder,int[] preorder,int l,int r,int head){
        TreeNode n = new TreeNode();
        n.val=head;
        for(int i = l;i<r;i++){
            if(preorder[head]==inorder[i]){
                if(i>l){
                    n.left = cons(inorder,preorder,0,i,head+1);
                }
                if(i<r-1) {
                    n.right = cons(inorder,preorder,i + 1, r,head+i-l+1);
                }
            }
        }
//        Node a = new Node();
        return n;
    }
}
