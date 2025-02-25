package cses;

import java.util.*;
import java.io.*;

public class DistinctNumbers {
    public static void main(String[] args) throws Exception {
        Set<Integer> st = new HashSet<>();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());

        t = new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            st.add(Integer.parseInt(t.nextToken()));
        }

        out.println(st.size());
        out.close();
    }
}
