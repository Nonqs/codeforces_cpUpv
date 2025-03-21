package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HelpfulMaths {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());

        String s = t.nextToken();
        int[] a = new int[s.length() / 2 + 1];
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '+') {
                a[c] = Character.getNumericValue(s.charAt(i));
                c++;
            }
        }

        Arrays.sort(a);
        c = 1;
        String r = a[0] + "";
        for (int i = 1; i < s.length(); i++) {
            if (i % 2 == 0) {
                r += "" + a[c];
                c++;
            } else {
                r += "+";
            }
        }

        out.println(r);
        out.close();

    }
}
