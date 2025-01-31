package Rating800;

import java.io.*;
import java.util.*;

public class Minimize {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());

        while (test-- > 0) {
            t = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(t.nextToken());
            int b = Integer.parseInt(t.nextToken());
            int c = a;
            int v = 0;

            for (int i = a + 1; i <= b; i++) {
                if ((i - a) + (b - i) < (c - a) + (b - c)) {
                    c = i;
                }
                v = (c - a) + (b - c);
            }
            out.println(v);
        }
        out.close();
    }
}
