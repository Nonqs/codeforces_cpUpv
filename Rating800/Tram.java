package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Tram {
     public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());

        int sum = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            t = new StringTokenizer(in.readLine());
            int e = Integer.parseInt(t.nextToken()), x = Integer.parseInt(t.nextToken());

            sum += x - e;
            if(sum > max) max = sum;

        }

        out.println(max);
        out.close();
    }
}
