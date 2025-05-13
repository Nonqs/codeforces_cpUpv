package contest.Div31020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CherryBomb {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int test = Integer.parseInt(in.readLine());
        while (test-- > 0) {
            StringTokenizer t = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(t.nextToken());
            int k = Integer.parseInt(t.nextToken());

            int[] a = new int[n];
            int[] b = new int[n];
            int maxA = Integer.MIN_VALUE;
            int minA = Integer.MAX_VALUE;

            t = new StringTokenizer(in.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(t.nextToken());
                maxA = Math.max(maxA, a[i]);
                minA = Math.min(minA, a[i]);
            }

            t = new StringTokenizer(in.readLine());
            boolean bNum = false;
            boolean tr = true;
            int tgSum = -1;

            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(t.nextToken());
                if (b[i] != -1) {
                    if (!bNum) {
                        tgSum = a[i] + b[i];
                        bNum = true;
                    } else if (a[i] + b[i] != tgSum) {
                        tr = false;
                        break;
                    }
                }
            }

            if (!tr) {
                out.println(0);
                continue;
            }

            if (bNum) {
                boolean valid = true;
                for (int i = 0; i < n; i++) {
                    if (b[i] == -1) {
                        int expectedB = tgSum - a[i];
                        if (expectedB < 0 || expectedB > k) {
                            valid = false;
                            break;
                        }
                    }
                }
                out.println(valid ? 1 : 0);
            } else {
                long xMin = maxA;
                long xMax = (long) minA + k;
                long res = Math.max(0, xMax - xMin + 1);
                out.println(res);
            }
        }

        out.close();
    }
}
