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
            int[] P = new int[N];

            for (int i = 0; i < N; i++) {
                P[i] = m.nextInt();
            }

            boolean changed = true;

            while (changed) {
                changed = false;

                for (int i = 0; i < N - 1; i++) {
                    if (P[i] > P[i + 1] &&
                        Math.abs(P[i] - P[i + 1]) > 1) {

                        int temp = P[i];
                        P[i] = P[i + 1];
                        P[i + 1] = temp;

                        changed = true;
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                System.out.print(P[i] + " ");
            }
            System.out.println();
        }

	}
}
