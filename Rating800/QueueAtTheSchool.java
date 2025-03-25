package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class QueueAtTheSchool {
     public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken()), s = Integer.parseInt(t.nextToken());

        t = new StringTokenizer(in.readLine());
        char[] c = t.nextToken().toCharArray();
        
        while (s-- > 0) {
        char aux = c[0];
            for(int i = 1; i < c.length; i++){
                if(aux == 'B' && c[i] == 'G'){
                    c[i-1] = c[i];
                    c[i] = aux;
                    i++;
                }
                if(i < c.length) aux = c[i];
            
            }
        }

        out.println(String.valueOf(c));
        out.close();
     }
}
