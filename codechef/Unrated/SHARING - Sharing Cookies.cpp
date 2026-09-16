import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner m = new Scanner(System.in);

        int A = m.nextInt();
        int B = m.nextInt();

        if ((A - B) % 2 == 0)
            System.out.println((A - B) / 2);
        else
            System.out.println(-1);
	} 
}
