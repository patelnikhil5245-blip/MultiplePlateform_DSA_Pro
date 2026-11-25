class Solution {
    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;

        int[] sa = buildSuffixArray(nums);
        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {
            rank[sa[i]] = i;
        }

        int[] lcp = new int[n];
        int h = 0;

        for (int i = 0; i < n; i++) {
            int r = rank[i];

            if (r == 0) continue;

            int j = sa[r - 1];

            while (i + h < n && j + h < n &&
                   nums[i + h] == nums[j + h]) {
                h++;
            }

            lcp[r] = h;

            if (h > 0) h--;
        }

        int ans = n;

        for (int i = 0; i < n; i++) {
            int maxLcp = 0;

            if (i > 0) {
                maxLcp = Math.max(maxLcp, lcp[i]);
            }

            if (i < n - 1) {
                maxLcp = Math.max(maxLcp, lcp[i + 1]);
            }

            int uniqueLength = maxLcp + 1;

            if (sa[i] + uniqueLength <= n) {
                ans = Math.min(ans, uniqueLength);
            }
        }

        return ans;
    }

    private int[] buildSuffixArray(int[] nums) {
        int n = nums.length;

        Integer[] sa = new Integer[n];

        for (int i = 0; i < n; i++) {
            sa[i] = i;
        }

        int[] rank = new int[n];
        int[] temp = new int[n];

        Integer[] sorted = new Integer[n];

        for (int i = 0; i < n; i++) {
            sorted[i] = nums[i];
        }

        Arrays.sort(sorted, (a, b) -> Integer.compare(a, b));

        Map<Integer, Integer> map = new HashMap<>();
        int id = 0;

        for (int x : sorted) {
            if (!map.containsKey(x)) {
                map.put(x, id++);
            }
        }

        for (int i = 0; i < n; i++) {
            rank[i] = map.get(nums[i]);
        }

        for (int k = 1; k < n; k *= 2) {
            final int len = k;

            Arrays.sort(sa, (a, b) -> {
                if (rank[a] != rank[b]) {
                    return Integer.compare(rank[a], rank[b]);
                }

                int ra = a + len < n ? rank[a + len] : -1;
                int rb = b + len < n ? rank[b + len] : -1;

                return Integer.compare(ra, rb);
            });

            temp[sa[0]] = 0;

            for (int i = 1; i < n; i++) {
                int a = sa[i - 1];
                int b = sa[i];

                int a1 = rank[a];
                int b1 = rank[b];

                int a2 = a + len < n ? rank[a + len] : -1;
                int b2 = b + len < n ? rank[b + len] : -1;

                temp[b] = temp[a] +
                    ((a1 != b1 || a2 != b2) ? 1 : 0);
            }

            for (int i = 0; i < n; i++) {
                rank[i] = temp[i];
            }

            if (rank[sa[n - 1]] == n - 1) break;
            if (k > n / 2) break;
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = sa[i];
        }

        return result;
    }
}
