package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Hulk {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());

        String r = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                r += "I love ";
            } else {
                r += "I hate ";
            }

            if (i < n - 1) {
                r += "that ";
            } else {
                r += "it";
            }
        }

        out.println(r);
        out.close();
    }
}
