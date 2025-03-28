package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Drinks {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());
        double sum = 0;

        t = new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(t.nextToken());
        }

        out.println(sum / n);
        out.close();
    }
}
