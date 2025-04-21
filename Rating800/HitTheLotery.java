package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HitTheLotery {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());
        int[] a = { 1, 5, 10, 20, 100 };
        int c = 0;
        int i = a.length - 1;
        while (n > 0) {
            c += n / a[i];
            n = n % a[i];
            i--;
        }

        out.println(c);
        out.close();
    }
}
