

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s = in.readLine();
        StringTokenizer t = new StringTokenizer(s);

        int c = Integer.parseInt(t.nextToken());

        for (int i = 0; i < c; i++) {

            s = in.readLine();
            t = new StringTokenizer(s);
            int n = Integer.parseInt(t.nextToken());
            int r = Integer.parseInt(t.nextToken());

            s = in.readLine();
            t = new StringTokenizer(s);
            int sum = 0;

            int[] f = new int[n];
            for (int j = 0; j < n; j++) {
                f[j] = Integer.parseInt(t.nextToken());
                sum = sum + f[j];
            }
            int m1 = 0;
            int m2 = 0;
            int m3 = 0;
            for (int j = 0; j < n; j++) {
                if (f[j] % 2 == 0) {
                    m2++;
                } else if (f[j] == 1) {
                    m1++;
                } else {
                    m3++;
                }
            }

            if (m2 + m1 == n || ((m1 == r / 2 && m2 == 0) && (sum < (r * 2) - 2))) {
                out.println(sum);
            } else if (sum < (r * 2) - 2) {
                out.println(sum);
            } else {
                if(m3 == m1){
                out.println(sum - 2);
                } else if(m3>m1){
                    out.println(sum - 2*(1 + sum - n));
                } else{
                    out.println(sum - 2*(m1-m3));
                }
            }

        }

        out.close();

    }
}
