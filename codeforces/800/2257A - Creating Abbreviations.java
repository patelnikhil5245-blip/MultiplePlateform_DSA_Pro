import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            boolean[] available = new boolean[26];

            // Initial words
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                available[s.charAt(0) - 'a'] = true;
            }

            String[] a = new String[m];

            for (int i = 0; i < m; i++) {
                a[i] = sc.next();
            }

            boolean possible = true;

            for (String s : a) {

                for (char ch : s.toCharArray()) {

                    int idx = ch - 'A';

                    if (!available[idx]) {
                        possible = false;
                        break;
                    }
                }

                if (!possible)
                    break;
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}