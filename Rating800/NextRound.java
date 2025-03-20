package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NextRound {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(t.nextToken());
        int p = Integer.parseInt(t.nextToken());
        int s = 0;
        int[] a = new int[n];

        t = new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(t.nextToken());
        }
        s = a[p - 1];
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= s && a[i] > 0) {
                c++;
            }
        }
        out.println(c);
        out.close();
    }
}
