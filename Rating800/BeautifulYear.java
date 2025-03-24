package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BeautifulYear {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());
        boolean d = false;

        while (!d) {
            n++;
            HashMap<Integer, Integer> digits = new HashMap<Integer, Integer>();
            int aux = n;
            while (aux > 0) {
                int digit = aux % 10;
                if (digits.containsKey(digit)) {
                    d = false;
                    break;
                } else {
                    digits.put(digit, 1);
                }
                aux = aux / 10;
            }

            if (digits.size() == 4) {
                d = true;
            }
        }

        out.println(n);
        out.close();

    }
}
