package Rating800;

import java.io.*;
import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s = in.readLine();
        StringTokenizer t = new StringTokenizer(s);

        String u = t.nextToken();
        char[] c = new char[u.length()];
        String user = "";

        for (int i = 0; i < c.length; i++) {
            if (i == 0) {
                user = user + u.charAt(i);
                c[i] = u.charAt(i);
            }
            for (int j = 0; j < i; j++) {
                if (c[j] != u.charAt(i) && j == i - 1) {
                    c[i] = u.charAt(i);
                    user = user + u.charAt(i);
                } else if (c[j] == u.charAt(i)) {

                    break;
                }
            }
        }
        System.out.println(Arrays.toString(c));
        System.out.println(user);
        if (user.length() < u.length() / 2)
            out.print("IGNORE HIM!");
        else
            out.print("CHAT WITH HER!");

        out.close();

    }
}
