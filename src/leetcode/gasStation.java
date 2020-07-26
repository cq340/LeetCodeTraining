package leetcode;

public class gasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || gas.length == 0)
            return -1;
        for (int i = 0; i < gas.length; i++) {
            int sum = 0;
            for (int j = i; j < i + gas.length; j++) {
                if (gas[j] < cost[j])
                    break;
                sum += gas[j % gas.length] - cost[j % gas.length];
                if (sum < 0)
                    break;
            }
            if (sum >= 0)
                return i;
        }
        return -1;
    }


    public int canCompleteCircuit2(int[] gas, int[] cost) {
        int n = gas.length;
        //考虑从每一个点出发
        for (int i = 0; i < n; i++) {
            int j = i;
            int remain = gas[i];
            //当前剩余的油能否到达下一个点
            while (remain - cost[j] >= 0) {
                //减去花费的加上新的点的补给
                remain = remain - cost[j] + gas[(j + 1) % n];
                j = (j + 1) % n;
                //j 回到了 i
                if (j == i) {
                    return i;
                }
            }
        }
        //任何点都不可以
        return -1;
    }


}
