public class MaxPath {
    public MaxPath(){}
    public int maxPathSum(TreeNode root) {
        int[] out = dp(root);
        return Math.max(out[0],out[1]);
    }
    private int[] dp(TreeNode root){
        int[] out = new int[2];
        out[0] = 0;
        out[1] = 0;
        if(root==null){return out;}
        int[] left = dp(root.left);
        int[] right = dp(root.right);
        int mid = left[1]+right[1]+root.val;
        out[0] = Math.max(left[0],right[0]);
        out[0] = Math.max(out[0],mid);
        out[1] = Math.max(left[1],right[1])+root.val;
        return out;
    }
}
