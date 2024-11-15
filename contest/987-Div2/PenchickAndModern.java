import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class PenchickAndModern {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
 
        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());
 
        while (test-- > 0) {
 
            t = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(t.nextToken());
            int[] a = new int[n];
 
            t = new StringTokenizer(in.readLine());
 
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(t.nextToken());
 
            int prev = a[0];
            int m = 1;
            int cont = 1;

            for (int j = 1; j < a.length; j++) {
                if (a[j] == prev) {
                    cont++;
                } else {
                    m = Math.max(m, cont);
                    cont = 1;
                    prev = a[j];
                }
            }
            m = Math.max(m, cont);

            out.println(n-m);
 
        }
 
        out.close();
    }
 
}