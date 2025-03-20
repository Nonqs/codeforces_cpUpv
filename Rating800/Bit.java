package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Bit {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(t.nextToken());
        int c = 0;
        for (int i = 0; i < n; i++) {
            t = new StringTokenizer(in.readLine());
            if (t.nextToken().charAt(1) == '+') {
                c++;
            } else {
                c--;
            }
        }
        out.println(c);
        out.close();
    }
}
