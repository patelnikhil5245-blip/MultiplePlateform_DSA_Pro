import java.util.*;

public class Main {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner m = new Scanner(System.in);

        int t = m.nextInt();

        while (t-- > 0) {
            int n = m.nextInt();
            int x = m.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = m.nextInt();
            }

            long ans = 0;
            int y = x;

            for (int p = 2; p * p <= y; p++) {
                if (y % p == 0) {
                    long sum = 0;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] % p == 0) {
                            sum += arr[i];
                        }
                    }

                    ans = Math.max(ans, sum);

                    while (y % p == 0) {
                        y /= p;
                    }
                }
            }

            if (y > 1) {
                long sum = 0;

                for (int i = 0; i < n; i++) {
                    if (arr[i] % y == 0) {
                        sum += arr[i];
                    }
                }

                ans = Math.max(ans, sum);
            }

            System.out.println(ans);
        }

    }
}