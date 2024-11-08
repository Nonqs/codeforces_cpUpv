package Rating800;

import java.util.*;
import java.io.*;

public class AquaMoonAndTwoArrays {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s = in.readLine();
        StringTokenizer t = new StringTokenizer(s);

        int[] a = new int[Integer.parseInt(t.nextToken())];
        int[] b = new int[a.length];

        for (int i = 0; i < 2; i++) {

            s = in.readLine();
            t = new StringTokenizer(s);
            if (i == 0) {
                for(int j = 0; i < a.length; i++){
                    a[j] = Integer.parseInt(t.nextToken());
                }
            } else {
                for(int j = 0; i < b.length; i++){
                    b[j] = Integer.parseInt(t.nextToken());
                }
            }
        }

        s = in.readLine();
        t = new StringTokenizer(s);

    }
}
