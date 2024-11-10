import java.util.*;
import java.io.*;

public class AliceAdventures {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());

        for (int i = 0; i < test; i++) {

            t = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(t.nextToken());

            int[] p = new int[2];
            p[0] = Integer.parseInt(t.nextToken());
            p[1] = Integer.parseInt(t.nextToken());

            t = new StringTokenizer(in.readLine());
            String text = t.nextToken();

            int[] alice = new int[] { 0, 0 };

            boolean ver = false;

            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < n; k++) {
                    if (text.charAt(k) == 'N') {

                        alice[1] = alice[1] + 1;
                        if (alice[1] == p[1] && alice[0] == p[0])
                            ver = true;

                    } else if (text.charAt(k) == 'E') {

                        alice[0] = alice[0] + 1;
                        if (alice[1] == p[1] && alice[0] == p[0])
                            ver = true;

                    } else if (text.charAt(k) == 'S') {

                        alice[1] = alice[1] - 1;
                        if (alice[1] == p[1] && alice[0] == p[0])
                            ver = true;

                    } else {
                        alice[0] = alice[0] - 1;
                        if (alice[1] == p[1] && alice[0] == p[0])
                            ver = true;
                    }
                }
            }

            if (ver == true) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.close();

    }

}