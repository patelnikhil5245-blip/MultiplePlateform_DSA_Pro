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
            int K = m.nextInt();

            if (K <= N)
                System.out.println(0);
            else
                System.out.println(2*(K - N));
        }
	}
}
