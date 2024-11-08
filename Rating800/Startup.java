package Rating800;

import java.io.*;
import java.util.*;

public class Startup {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s = in.readLine();
        StringTokenizer t = new StringTokenizer(s);

        int test = Integer.parseInt(t.nextToken());

        for (int i = 0; i < test; i++) {

            s = in.readLine();
            t = new StringTokenizer(s);
            int n = Integer.parseInt(t.nextToken()), k = Integer.parseInt(t.nextToken());
            int sum = 0;
            int[] brand = new int[k];
            int[] p = new int[k];

            for (int j = 0; j < k; j++) {
                s = in.readLine();
                t = new StringTokenizer(s);
                int b1 = Integer.parseInt(t.nextToken());
                int p1 = Integer.parseInt(t.nextToken());
                if (j == 0) {
                    brand[j] = b1;
                    p[j] = p1;
                } else {
                    int index = -1;
                    for (int m = 0; m < brand.length; m++) {
                        if (brand[m] == b1) {
                            index = i;
                            break;
                        }
                    }

                    if (index == -1) {
                        brand[j] = b1;
                        p[j] = p1;
                    } else {
                        p[index] = p[index] + p1;
                    }
                }
            }

            Arrays.sort(p);

            for (int j = 0; j < p.length / 2; j++) {
                int temp = p[j];
                p[j] = p[p.length - 1 - j];
                p[p.length - 1 - j] = temp;
            }

            if (n < k) {

                for (int j = 0; j < n; j++) {
                    sum = sum + p[j];
                }
            } else {
                for (int j = 0; j < k; j++) {
                    sum = sum + p[j];
                }
            }

            out.println(sum);

        }

        out.close();
    }
}
