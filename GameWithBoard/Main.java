package GameWithBoard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s = in.readLine();
        StringTokenizer t = new StringTokenizer(s);

        int test = Integer.parseInt(t.nextToken());

        for (int i = 0; i < test; i++) {

            s = in.readLine();
            t = new StringTokenizer(s);
            int n = Integer.parseInt(t.nextToken());
            LinkedList<Integer> b = new LinkedList<Integer>();

            for (int j = 0; j < n; j++) {
                b.add(j, 1);
            }

            int num = 1;
            int p = possiblePlays(b);

            for (int j = 1; j < p; j++) {
                LinkedList<Integer> b2 = b;

                for (int k = 0; k < b2.size(); k++) {
                    if (b2.get(k) == b2.get(k + 1)) {
                        b2.add(b.get(k) + b2.get(k + 1));
                        b2.remove(k);
                        b2.remove(k + 1);
                        Collections.sort(b2);
                        break;
                    }
                }

                int p2 = possiblePlays(b2);
                if (p2 == 0 && j == p - 1) {
                    b = b2;
                    num++;
                    break;
                } else if (p2 > 0) {
                    b = b2;
                    num++;
                    break;
                }
            }

            if (num % 2 == 0) {
                out.println("Alice");
            } else {
                out.println("Bob");
            }
        }

        out.close();
    }

    public static int possiblePlays(LinkedList<Integer> b) {

        int c = 0;
        int numbers = 1;
        int n = b.getFirst();

        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) == n) {
                c++;
            } else {
                numbers++;
                n = b.get(i);
            }
        }

        return c - numbers;
    }

}
