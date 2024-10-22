package LittleNikita;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s = in.readLine();
        StringTokenizer t = new StringTokenizer(s);

        int test = Integer.parseInt(t.nextToken());

        for (int i = 0; i < test; i++) {
            s = in.readLine();
            t = new StringTokenizer(s);

            int n = Integer.parseInt(t.nextToken());
            int m = Integer.parseInt(t.nextToken());

            int d = n - m;

            if (m > n) {
                out.println("No");
            } else if (m == n || d%2 == 0) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

        out.close();

    }
}
