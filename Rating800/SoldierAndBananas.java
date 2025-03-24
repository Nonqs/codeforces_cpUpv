package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SoldierAndBananas {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(t.nextToken()), b = Integer.parseInt(t.nextToken()),
                c = Integer.parseInt(t.nextToken());

        int co = 0;

        for (int i = 1; i <= c; i++) {
            co += a * i;
        }

        if (co - b <= 0) {
            out.println(0);
        } else {
            out.println(co - b);
        }

        out.close();
    }
}
