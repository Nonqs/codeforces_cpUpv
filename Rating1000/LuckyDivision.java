package Rating1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class LuckyDivision {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        String s = t.nextToken();
        int a = Integer.parseInt(s);
        char[] c = s.toCharArray();

        if (a % 4 == 0 || a % 7 == 0 || a % 44 == 0 || a % 47 == 0 || a % 74 == 0 || a % 77 == 0) {
            out.println("YES");
            out.close();
        }

        boolean b = true;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != '4' && c[i] != '7')
                b = false;
        }

        if (b)
            out.println("YES");
        else
            out.println("NO");

        out.close();
    }
}
