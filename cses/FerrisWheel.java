package cses;

import java.util.*;
import java.io.*;

public class FerrisWheel {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());
        int x = Integer.parseInt(t.nextToken());

        int[] p = new int[n];
        t = new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(t.nextToken());
        }

        Arrays.sort(p);

        int i = 0;
        int j = p.length - 1;
        int c = 0;

        while (i <= j) {
            if (p[i] + p[j] <= x) {
                c++;
                i++;
                j--;
            } else {
                c++;
                j--;
            }
        }
        out.println(c);
        out.close();
    }

}
