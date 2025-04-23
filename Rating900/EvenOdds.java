package Rating900;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EvenOdds {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken()), k = Integer.parseInt(t.nextToken());

        int[] a = new int[n];
        int cont = 0;
        for (int i = 1; i <= n; i += 2) {
            a[cont] = i;
            cont++;
        }
        for (int i = 2; i <= n; i += 2) {
            a[cont] = i;
            cont++;
        }

        out.println(a[k]);
        out.close();
    }
}
