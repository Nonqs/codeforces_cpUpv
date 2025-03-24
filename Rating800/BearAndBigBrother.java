package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BearAndBigBrother {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(t.nextToken()), b = Integer.parseInt(t.nextToken());

        int c = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            c++;
        }

        out.println(c);
        out.close();
    }
}
