import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            // Agar question me 'n' hai, toh iske upar int n = sc.nextInt(); wapas laga lena
            String s = sc.next();
            
            StringBuilder ans = new StringBuilder(s);
            
            int zeroIdx = ans.indexOf("0");
            if (zeroIdx != -1) {
                ans.deleteCharAt(zeroIdx);
            }
            
            int oneIdx = ans.indexOf("1");
            if (oneIdx != -1) {
                ans.deleteCharAt(oneIdx);
            }
            
            System.out.println(ans);
        }
    }
}