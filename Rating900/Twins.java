package Rating900;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Twins {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());

        Integer[] a = new Integer[n];
        int b = 0;
        t = new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(t.nextToken());
            b += a[i];
        }

        Arrays.sort(a, Collections.reverseOrder());

        int c = 0;
        int aux = 0;
        while (aux <= b) {
            aux += a[c];
            b -= a[c];
            c++;
        }
        out.println(c);
        out.close();

    }
}
