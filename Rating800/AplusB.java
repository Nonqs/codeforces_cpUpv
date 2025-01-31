package Rating800;

import java.io.*;
import java.util.*;

public class AplusB {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());

        while (test-- > 0) {
            t = new StringTokenizer(in.readLine());
            String n = t.nextToken();
            int a =  n.charAt(0) - '0';
            int b =  n.charAt(1) - '0';

            out.println(a + b);
        }

        out.close();
    }
}
