package contest.Div31020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class StChroma {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());
        while (test-- > 0) {

            t = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(t.nextToken()), x = Integer.parseInt(t.nextToken());

            int[] a = new int[n];

            if (n == x) {
                for (int i = 0; i < n; i++) {
                    a[i] = i;

                }

                for (int i = 0; i < n; i++) {
                    out.print(a[i] + " ");
                }
                out.println("");
            } else {
                for (int i = 0; i < n; i++) {
                    if (i == n - 1) {
                        a[i] = x;
                    } else if (i != x) {
                        a[i] = i;
                    } else {
                        a[i] = n - 1;
                    }
                }

                for (int i = 0; i < n; i++) {
                    out.print(a[i] + " ");
                }
                out.println("");
            }
        }

        out.close();
    }
}
