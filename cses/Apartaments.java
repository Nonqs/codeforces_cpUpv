package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Apartaments {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());
        int m = Integer.parseInt(t.nextToken());
        int k = Integer.parseInt(t.nextToken());

        int[] p = new int[n];
        t = new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(t.nextToken());
        }

        int[] a = new int[m];
        t = new StringTokenizer(in.readLine());
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(t.nextToken());
        }

        int c = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (p[i] + k >= a[j] && p[i] - k <= a[j]) {
                    c++;
                    a[j] = -10;
                    break;
                }
            }
        }

        out.println(p);
        out.close();
    }
}
