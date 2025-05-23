package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CalculatingFuction {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        long n = Long.parseLong(t.nextToken());
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = -(n + 1) / 2;
        }

        out.println(n);
        out.close();
    }
}
