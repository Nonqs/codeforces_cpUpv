package BoyAndGirl;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int[][] a = new int[5][5];
        int pI = 0;
        int pJ = 0;
        ;
        for (int i = 0; i < 5; i++) {

            String s = in.readLine();
            StringTokenizer t = new StringTokenizer(s);

            for (int j = 0; j < 5; j++) {

                a[i][j] = Integer.parseInt(t.nextToken());

                if (a[i][j] == 1) {
                    pI = i;
                    pJ = j;
                }

            }
        }

        int positionI = pI == 2 ? (0) : (pI < 2 ? (2 - pI) : (pI - 2));
        int positionJ = pJ == 2 ? (0) : (pJ < 2 ? (2 - pJ) : (pJ - 2));

        out.println(positionI + positionJ);
        out.close();

    }
}
