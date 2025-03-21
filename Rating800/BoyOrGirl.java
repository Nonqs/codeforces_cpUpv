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
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char c : u.toCharArray()) {
            uniqueChars.add(c);
        }

        if (uniqueChars.size() % 2 != 0)
            out.print("IGNORE HIM!");
        else
            out.print("CHAT WITH HER!");

        out.close();

    }
}
