package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());
        int[] s = new int[n];
        t = new StringTokenizer(in.readLine());
        for (int k = 0; k < n; k++) {
            s[k] = Integer.parseInt(t.nextToken());
        }
        int i = 0, j = 0;
        int max = s[0], min = s[0];
        for (int k = 1; k < n; k++) {
            if (s[k] > max) {
                max = s[k];
                i = k;

            } else if (s[k] <= min) {
                min = s[k];
                j = k;
            }
        }

        int m1 = i;
        int m2 = n - (j + 1);
        if (i > j) {
            out.println((m1 + m2) - 1);
        } else {
            out.println(m1 + m2);
        }
        out.close();
    }
}
