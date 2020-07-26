package leetcode;

import java.util.HashMap;

public class sumOfTwoElement {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return null;
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 1, 15};
        twoSum(nums, 9);
    }
}
