package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NearlyLuckyNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        String s = t.nextToken();
        char[] c = s.toCharArray();

        int cn = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '4' || c[i] == '7')
                cn++;
        }

        if (cn == 4 || cn == 7) {
            out.println("YES");
        } else {
            out.println("NO");
        }

        out.close();
    }
}
