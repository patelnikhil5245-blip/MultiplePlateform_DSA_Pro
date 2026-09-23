class Solution {
    public int formPyramid(int[] arr) {
        // code here
        int n = arr.length;
                if (n == 0) return 0;

                long totalSum = 0;
                for (int height : arr) {
                    totalSum += height;
                }

                int[] left = new int[n];
                int[] right = new int[n];

                // Calculate the maximum left slope heights
                left[0] = Math.min(arr[0], 1);
                for (int i = 1; i < n; i++) {
                    left[i] = Math.min(arr[i], left[i - 1] + 1);
                }

                // Calculate the maximum right slope heights
                right[n - 1] = Math.min(arr[n - 1], 1);
                for (int i = n - 2; i >= 0; i--) {
                    right[i] = Math.min(arr[i], right[i + 1] + 1);
                }

                // Find the maximum possible peak height
                long maxPeak = 0;
                for (int i = 0; i < n; i++) {
                    int currentPeak = Math.min(left[i], right[i]);
                    maxPeak = Math.max(maxPeak, currentPeak);
                }

                // The total sum of a pyramid with height x is x^2
                long maxPyramidSum = maxPeak * maxPeak;

                // Fixed type casting precedence
                return (int) (totalSum - maxPyramidSum);
    }
};