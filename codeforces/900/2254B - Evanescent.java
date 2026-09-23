import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        
        while (t-- > 0) {
            int n = m.nextInt();
            String s = m.next();
            
            int L = 1; 
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    L++;
                }
            }
            int max = 0; 
            
            for (int i = 1; i < n - 1; i++) {
                
                if (s.charAt(i - 1) == s.charAt(i + 1) && s.charAt(i) != s.charAt(i + 1)) {
                    max = 2;
                    break;
                } 
                else if (s.charAt(i - 1) != s.charAt(i) && s.charAt(i) != s.charAt(i + 1) && s.charAt(i - 1) != s.charAt(i + 1)) {
                    max = Math.max(max, 1);
                }
            }
            
            System.out.println(L - max);
        }
        
        
    }
}