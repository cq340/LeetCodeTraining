package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<List<Integer>> res = new ArrayList();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return res;

        Queue<TreeNode> nodeQueue = new LinkedList<>();

        Queue<TreeNode> treeNodes = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            int count = nodeQueue.size();
            List<Integer> list = new ArrayList<>();
            while (count > 0) {
                TreeNode tempNode = nodeQueue.poll();
                list.add(tempNode.val);
                count--;
                if (tempNode.left != null)
                    nodeQueue.add(tempNode.left);
                if (tempNode.right != null)
                    nodeQueue.add(tempNode.right);
            }
            res.add(list);
        }
        return res;
    }
}
