package February;

import java.util.Comparator;
import java.util.PriorityQueue;

public class number5323 {
    public int[] sortByBits(int[] arr) {

        PriorityQueue<Integer> pQ = new PriorityQueue<>((o1, o2) -> {
            if (Integer.bitCount(o1) == Integer.bitCount(o2)) {
                return o2 - o1;
            }
            return Integer.bitCount(o2) - Integer.bitCount(o1);
        });
        for (int i : arr) {
            pQ.add(i);
        }

        int i = arr.length-1;
        while (!pQ.isEmpty()) {
            arr[i--] = pQ.poll();
        }
        return arr;
    }

}
