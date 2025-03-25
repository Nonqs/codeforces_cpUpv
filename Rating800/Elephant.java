package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Elephant {
     public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());
        
        int c = 0;
        while (n > 0) {
            for(int i = 5; i > 0; i--){
                if(i <= n){
                    n -= i;
                    break;
                }
            }

            c++;
        }

        out.print(c);
        out.close();
     }
}
