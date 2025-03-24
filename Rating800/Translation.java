package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Translation {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        String s = t.nextToken();

        t = new StringTokenizer(in.readLine());
        String b = t.nextToken();

        String r = "";
        for (int i = b.length() - 1; i >= 0; i--) {
            r += b.charAt(i);
        }

        if (s.equals(r)) {
            out.println("YES");
        } else {
            out.println("NO");
        }

        out.close();
    }
}
