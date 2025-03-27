package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Magnets {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());

        t = new StringTokenizer(in.readLine());
        int c = 1;
        int prev = Integer.parseInt(t.nextToken());
        for (int i = 1; i < n; i++) {
            t = new StringTokenizer(in.readLine());
            int nw = Integer.parseInt(t.nextToken());
            if (prev != nw) {
                c++;
                prev = nw;
            }
        }

        out.println(c);
        out.close();
    }
}
