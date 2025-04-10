package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class WannaBeTheGuy {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());

        HashMap<Integer, Integer> levels = new HashMap<Integer, Integer>();

        for (int i = 0; i < 2; i++) {
            t = new StringTokenizer(in.readLine());
            t.nextToken();
            while (t.hasMoreTokens()) {
                int num = Integer.parseInt(t.nextToken());
                levels.put(num, levels.getOrDefault(num, 0) + 1);
            }
        }
        boolean tr = true;
        for (int i = 1; i <= n; i++) {
            if (!levels.containsKey(i)) {

                tr = false;
            }
        }

        if (tr) {
            out.println("I become the guy.");
        } else {
            out.println("Oh, my keyboard!");
        }

        out.close();
    }
}
