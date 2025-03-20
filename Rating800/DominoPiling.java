package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DominoPiling {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());

        int m = Integer.parseInt(t.nextToken());
        int n = Integer.parseInt(t.nextToken());

        out.println((m * n) / 2);
        out.close();

    }
}
