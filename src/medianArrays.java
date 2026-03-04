import java.util.Arrays;

public class medianArrays {
    public static void main(String[] args) {
        int[] n1 = {2, 6, 4};
        int[] n2 = {1, 7, 5};

        Arrays.sort(n1);
        Arrays.sort(n2);
        System.out.println(n1);
        System.out.println(n2);

        int m = n1.length;
        int n = n2.length;
        int[] merge = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (n1[i] < n2[j]) {
                merge[k++] = n1[i++];
            } else {
                merge[k++] = n2[j++];
            }
        }

            while (i < n) merge[k++] = n1[i++];
            while (j < m) merge[k++] = n1[j++];

            int m1 = merge.length;

            if (m1 % 2 == 0) {
                int result = (merge[(m1 / 2) - 1] + merge[m1 / 2]);
                System.out.println(result);
            } else {
                int result = merge[m1 / 2];
                System.out.println(result);

            }

        }
    }

