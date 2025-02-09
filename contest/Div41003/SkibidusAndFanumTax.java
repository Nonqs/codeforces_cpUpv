import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SkibidusAndFanumTax {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());

        while (test-- > 0) {
            t = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(t.nextToken());
            int m = Integer.parseInt(t.nextToken());

            int[] a = new int[n];
            t = new StringTokenizer(in.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(t.nextToken());
            }
            t = new StringTokenizer(in.readLine());
            int b = Integer.parseInt(t.nextToken());

            boolean[][] dp = new boolean[n][2];
            dp[0][0] = true; 
            dp[0][1] = true; 

            for (int i = 1; i < n; i++) {
                int o = a[i];
                int f = b - a[i];

                if (dp[i - 1][0] && a[i - 1] <= o) {
                    dp[i][0] = true;
                }
                if (dp[i - 1][1] && (b - a[i - 1]) <= o) {
                    dp[i][0] = true;
                }

                if (dp[i - 1][0] && a[i - 1] <= f) {
                    dp[i][1] = true;
                }
                if (dp[i - 1][1] && (b - a[i - 1]) <= f) {
                    dp[i][1] = true;
                }
            }

            if (dp[n - 1][0] || dp[n - 1][1]) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.close();
    }
}