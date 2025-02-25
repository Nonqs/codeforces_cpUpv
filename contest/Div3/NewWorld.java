package contest.Div3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NewWorld {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());

        while (test-- > 0) {
            t = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(t.nextToken());

            int k = Integer.parseInt(t.nextToken());
            int p = Integer.parseInt(t.nextToken());

            if (n * p < Math.abs(k)) {
                out.println(-1);
                continue;
            }

            int c = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (sum < Math.abs(k)) {
                    sum += p;   
                c++;
                }
            }

            out.println(c);

        }
        out.close();
    }
}
