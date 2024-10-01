package PetiaAndStrings;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        char[] a = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = in.readLine();
        StringTokenizer t = new StringTokenizer(s);

        String t1 = t.nextToken().toLowerCase();
        char[] b = new char[t1.length()];
        for (int i = 0; i < b.length; i++) {
            b[i] = t1.charAt(i);
        }

        s = in.readLine();
        t = new StringTokenizer(s);

        t1 = t.nextToken().toLowerCase();
        char[] c = new char[t1.length()];
        for (int i = 0; i < c.length; i++) {
            c[i] = t1.charAt(i);
        }

        for (int i = 0; i < t1.length(); i++) {
            if (b[i] != c[i]) {
                for (int j = a.length - 1; j >= 0; j--) {
                    if (b[i] == a[j]) {
                        out.println("1");

                        out.close();
                    } else if (c[i] == a[j]) {

                        out.println("-1");

                        out.close();
                    }
                }
            } else if (i == t1.length() - 1) {
                out.println("0");

                out.close();
            }
        }

    }
}
