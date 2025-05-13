package contest.Div31020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DrTC {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());
        while (test-- > 0) {

            t = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(t.nextToken());
            String[] a = new String[n];

            t = new StringTokenizer(in.readLine());
            String s = t.nextToken();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    StringBuilder auxBuilder = new StringBuilder(s);
                    auxBuilder.setCharAt(i, '1');
                    a[i] = auxBuilder.toString();
                } else {
                    StringBuilder auxBuilder = new StringBuilder(s);
                    auxBuilder.setCharAt(i, '0');
                    a[i] = auxBuilder.toString();
                }
            }
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i].charAt(j) == '1') {
                        c++;
                    }
                }
            }

            out.println(c);
        }

        out.close();
    }
}
