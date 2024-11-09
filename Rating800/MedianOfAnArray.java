package Rating800;

import java.util.*;
import java.io.*;

public class MedianOfAnArray {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());

        int test = Integer.parseInt(t.nextToken());

        for (int i = 0; i < test; i++) {
            t = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(t.nextToken());

            t = new StringTokenizer(in.readLine());
            ArrayList<Integer> a = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                a.add(Integer.parseInt(t.nextToken()));
            }

            Collections.sort(a);

            int m = (n - 1) / 2;
            int indexM = a.lastIndexOf(a.get(m));
            int count = (indexM - m) + 1;

            out.println(count);

        }

        out.close();
    }

}
