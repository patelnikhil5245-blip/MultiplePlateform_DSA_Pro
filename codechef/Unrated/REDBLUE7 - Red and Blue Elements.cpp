import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner m = new Scanner(System.in);

        int T = m.nextInt();

        while (T-- > 0) {
            int N = m.nextInt();

            long[] A = new long[N];

            for (int i = 0; i < N; i++) {
                A[i] = m.nextLong();
            }

            Arrays.sort(A);

            long total = 0;
            for (long x : A) {
                total += x;
            }

            long prefix = 0;
            long ans = Long.MIN_VALUE;

            for (int k = 1; k < N; k++) {
                prefix += A[k - 1];

                long SR = prefix;
                long CR = k;

                long SB = total - prefix;
                long CB = N - k;

                long value = SR * CB + SB * CR;

                ans = Math.max(ans, value);
            }

            System.out.println(ans);
        }
	}
}
