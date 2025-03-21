package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class WordCapitalization {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        String s = t.nextToken();

        char c = s.charAt(0);
        s = Character.toUpperCase(c) + s.substring(1, s.length());

        out.println(s);
        out.close();

    }
}
