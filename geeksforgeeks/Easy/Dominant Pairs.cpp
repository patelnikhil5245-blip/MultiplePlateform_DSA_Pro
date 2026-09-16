import java.util.*;

class Solution {
    public int dominantPairs(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);

        int j = mid;
        int count = 0;

        for (int i = 0; i < mid; i++) {

            while (j < n && (long)arr[i] >= 5L * arr[j]) {
                j++;
            }

            count += j - mid;
        }

        return count;
    }
}