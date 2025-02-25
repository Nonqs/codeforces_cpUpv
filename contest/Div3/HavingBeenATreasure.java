package contest.Div3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HavingBeenATreasure {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());
        while (test-- > 0) {

            t = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(t.nextToken());
            
            t = new StringTokenizer(in.readLine());
            String s = t.nextToken();

            int c1 = 0; 
            int c2 = 0;
            
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '-') {
                    c1++;
                } else { 
                    c2++;
                }
            }
            
            int l = c1 / 2;      
            int r = c1 - l;     
            
            long result = (long) c2 * l * r;
            out.println(result);
        }
        out.close();
    }
}

