package February;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

public class number124 {
    private int ret = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        getMax(root);
        return ret;
    }

    public int getMax(TreeNode r){
        if(r==null)
            return 0;
        HashMap<String,HashMap> objectObjectHashMap = new HashMap<>();
        Thread thread = new Thread();
        CountDownLatch countDownLatch = new CountDownLatch(5);
        countDownLatch.countDown();


        int left=Math.max(0,getMax(r.left));
        int right=Math.max(0,getMax(r.right));
        ret=Math.max(ret, r.val + left + right);
        return Math.max(left,right)+r.val;
    }

}
