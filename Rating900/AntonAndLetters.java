package Rating900;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class AntonAndLetters {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int c = 0;
        HashMap<Integer, Character> ch = new HashMap<>();
        if (t.countTokens() == 1) {
            if (t.nextToken().length() == 3) {
                out.println(1);
            } else {
                out.println(0);
            }

            out.close();
        }
        while (t.hasMoreTokens()) {
            if (c == 0) {
                ch.put(c, t.nextToken().charAt(1));
                c++;
            } else {
                char nw = t.nextToken().charAt(0);
                if (!ch.containsValue(nw)) {
                    ch.put(c, nw);
                    c++;
                }
            }
        }
        out.println(c);
        out.close();
    }
}
