package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Permutations {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());

        if (n < 4) {

            out.println("NO SOLUTION");
            out.close();
        }

        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                out.println(i);
            }
        }

        for (int i = n; i < 0; i--) {
            if (i % 2 != 0) {
                out.println(i);
            }
        }

        out.close();

    }
}
