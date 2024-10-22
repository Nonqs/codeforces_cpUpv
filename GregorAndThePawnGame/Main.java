package GregorAndThePawnGame;

import java.io.*;
import java.util.*;

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

            s = in.readLine();
            t = new StringTokenizer(s);

            String ith = t.nextToken();

            s = in.readLine();
            t = new StringTokenizer(s);

            String jth = t.nextToken();
            int p = n;
            char[] e = new char[n];
            char[] g = new char[n];

            for (int j = 0; j < n; j++) {
                e[j] = ith.charAt(j);
                g[j] = jth.charAt(j);
            }

            for (int j = 0; j < n; j++) {
                if (g[j] == '1') {

                    if (e[j] == '0') {
                        e[j] = '2';
                    } else {

                        if ((j == 0 && e[j + 1] == '1')) {
                            e[j + 1] = '2';
                        } else if (j == n - 1 && e[j - 1] == '1') {
                            e[j - 1] ='2';
                        } else if ((j != 0 && j != n - 1) && e[j - 1] == '1') {
                            e[j - 1] = '2';
                        } else if ((j != 0 && j != n - 1) && e[j + 1] == '1') {
                            e[j + 1] = '2';
                        }else {
                            p--;
                        }
                    }

                } else {
                    p--;
                }
            }

            out.println(p);
        }

        out.close();
    }
}
