package leetcode;

import java.util.ArrayList;
import java.util.List;

public class pathSum {
    List<List<Integer>> listAll = new ArrayList<List<Integer>>();
    List<Integer> list = new ArrayList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if(root == null) return listAll;
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
            listAll.add(new ArrayList<Integer>(list));
        pathSum(root.left, target);
        pathSum(root.right, target);
        list.remove(list.size()-1);
        return listAll;
    }

}
