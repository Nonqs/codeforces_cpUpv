package Rating800;

import java.util.*;
import java.io.*;

public class MedianOfAnArray {
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

            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(t.nextToken());
            }

            int c = 0;
            int par = n % 2 == 0 ? (1) : (0);

            Arrays.sort(a);
            int m = a[Math.round(n / 2) - par];
            int m2;

            do {

                int index = BetterIndex(a, m);
                a[index]++;
                Arrays.sort(a);
                m2 = a[(n / 2) - par];
                c++;
            } while (m2 <= m);

            out.println(c);
        }

        out.close();

    }

    public static int BetterIndex(int[] a, int m) {

        int index = 0;
        int[] a2 = a.clone();

        for (int i = 0; i < a.length; i++) {
            a2[i]++;

            Arrays.sort(a2);

            int m2;

            if (a2.length % 2 == 0) {
                m2 = a2[(a2.length / 2) - 1];
                index = (a2.length / 2) - 1;
            } else {
                m2 = a2[(a2.length / 2)];
                index = (a2.length / 2);
            }

            if (m2 > m) {
                index = i;
                return index;
            }

            a2 = a.clone();
        }
        return index;

    }
}
