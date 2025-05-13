package Rating900;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HQ9 {
    public static void main(String[] args) throws Exception {
        char[] c = { 'H', 'Q', '9' };

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        String s = t.nextToken();
        boolean tr = false;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < c.length; j++) {
                if (s.charAt(i) == c[j]) {
                    tr = true;
                }
            }
        }

        if (tr) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        out.close();

    }
}