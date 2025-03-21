package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class StonesontheTable {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());

        t = new StringTokenizer(in.readLine());
        StringBuilder s = new StringBuilder(t.nextToken());
        int aux = s.charAt(0);
        int c = 0;

        for (int i = 1; i < s.length(); i++) {
            if (aux == s.charAt(i)) {
                s.deleteCharAt(i);
                i--;
                c++;
                continue;
            }

            aux = s.charAt(i);
        }

        out.println(c);
        out.close();
    }
}
