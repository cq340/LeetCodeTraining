package leetcode;

public class WaterAmount {
    public static int getWaterLevel(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int index = 0;
        int total = 0;
        for (int i = 1; i < nums.length; i++) {
            int sum = 0;
            if (nums[i] > max) {
                int pre = index;
                while (++index < i) {
                    sum += nums[index];
                }
                total += (index - pre-1) * max - sum;
                max = nums[i];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(getWaterLevel(nums));
    }

}
