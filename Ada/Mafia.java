package Ada;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Mafia {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());

        t = new StringTokenizer(in.readLine());
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(t.nextToken());
        }

        boolean tr = true;
        int cont = 0;
        while (tr) {
            int m = 0;
            for (int i = 1; i < n; i++) {
                if (p[i] < p[m]) {
                    m = i;
                }
            }

            for (int i = 0; i < n; i++) {
                if (i != m) {
                    p[i]--;
                }
            }
            cont++;
            int ind = 0;
            for (int i = 0; i < n; i++) {
                if (p[i] <= 0)
                    ind++;
            }
            if (ind == n) {
                tr = false;
            }

        }

        out.println(cont);
        out.close();

    }
}
