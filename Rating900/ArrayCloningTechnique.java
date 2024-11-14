package Rating900;

import java.util.*;
import java.io.*;

public class ArrayCloningTechnique {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());

        for (int i = 0; i < test; i++) {

            t = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(t.nextToken());

            t = new StringTokenizer(in.readLine());
            int[] a = new int[n];
            for (int j = 0; j < n; j++)
                a[j] = Integer.parseInt(t.nextToken());

            Arrays.sort(a);
            int m = 1;
            int prev = a[0];
            int cont = 1;

            for (int j = 1; j < a.length; j++) {
                if (a[j] == prev) {
                    cont++;
                } else {
                    m = Math.max(m, cont);
                    cont = 1;
                    prev = a[j];
                }
            }
            m = Math.max(m, cont);

            int r = n - m;
            n = n - m;
            while (n > 0) {
                r++;
                n = n - m;
                m = m*2;
            }
            out.println(r);

        }

        out.close();

    }
}
