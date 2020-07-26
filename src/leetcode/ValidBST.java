package leetcode;

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return dfs(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }

    boolean dfs(TreeNode root, int max, int min){
        if(root==null) return true;
        if(root.val<=min || root.val>=max) return false;
        else return (dfs(root.left,root.val,min) && dfs(root.right,max,root.val));
    }
}
