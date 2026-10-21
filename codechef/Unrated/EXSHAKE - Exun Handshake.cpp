import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
     Scanner m=new Scanner(System.in);
      int t=m.nextInt();
      while(t-->0){
          int n=m.nextInt();
          long M=m.nextLong();
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
              arr[i]=m.nextInt();
          }
           Arrays.sort(arr);

            long people = 0;
            int groups = 0;

            for (int i = 0; i < n; i++) {
                long nextPeople = people + arr[i];
                long handshakes = nextPeople * (nextPeople - 1) / 2;

                if (handshakes <= M) {
                    people = nextPeople;
                    groups++;
                } else {
                    break;
                }
            }

            System.out.println(groups);
        

      }
	}
}
