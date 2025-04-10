package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DivisibilityProblem {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());

        while (n-- > 0) {
            t = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(t.nextToken()), b = Integer.parseInt(t.nextToken());
           if(a % b == 0) {
            out.println(a%b);
           }else{
            out.println(b-a%b);
           }
        }
        out.close();
    }
}
