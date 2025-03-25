package Rating900;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Football {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        char[] c = t.nextToken().toCharArray();

        int o = 0, z = 0;
        for(int i = 0; i < c.length; i++){
            if(c[i] == '0'){
                o = 0;
                z++;
            }else{
                z=0;
                o++;
            }
            if(z >= 7 || o >= 7) break;
        }
        if(z >= 7 || o >= 7) {
            out.println("YES");
        }else{
            out.println("NO");
        }

        out.close();

    }
}
