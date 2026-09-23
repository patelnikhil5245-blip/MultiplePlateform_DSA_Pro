import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        
        while (t-- > 0) {
            int n = m.nextInt();
            int arr[] = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = m.nextInt();
            }
            
            // Directly access the first and last elements without a second loop
            int first = arr[0];
            int last = arr[n - 1];
            
            System.out.println(Gcd(first, last));
        }
        
        m.close();
    }
    
    public static int Gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}