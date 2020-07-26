package February;

import java.util.HashMap;
import java.util.Stack;

public class MaxBoard {
    public int getMaxBoardLength(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        new HashMap();
        stack.push(root);
        int maxWidth=1;
        while (true) {
            int len = stack.size();
            if (len == 0)
                break;
            while (len>0){
                TreeNode head=stack.pop();
                len--;
                if(head.left!=null){
                    stack.push(head.left);
                }
                if(head.right!=null){
                    stack.push(head.right);
                }
            }
            maxWidth=Math.max(maxWidth,stack.size());
        }
        return maxWidth;
    }
}
