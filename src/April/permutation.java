package April;

public class permutation {
    public static void permutation(char[] perm, int from, int to) {
        if (to <= 1)
            return;
        if (from == to) //满足条件
        {
            for (int i = 0; i <= to; i++) {
                System.out.print(perm[i]);
            }
            System.out.println("");
        } else {
            for (int j = from; j <= to; j++) {
                swap(perm, j, from);
                permutation(perm, from + 1, to);
                swap(perm, j, from);
            }
        }

    }

    private static void swap(char[] perm, int j, int from) {
        char temp;
        temp = perm[j];
        perm[j] = perm[from];
        perm[from] = temp;
    }


    public static void main(String[] args) {
        String str = "123";
        permutation(str.toCharArray(), 0, 2);
    }

}
