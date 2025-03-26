package Rating1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class StringTask {
     public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        String s = t.nextToken().toUpperCase();
        char[] c = {'A', 'E', 'I', 'O', 'U', 'Y'};
        String r = "";

        for(int i = 0; i < s.length(); i++){
        boolean a = true;

            for(int j = 0; j < c.length; j++){
                if(c[j] == s.charAt(i)){
                    a = false;
                    break;
                };
            }

            if(a) r+= "."+s.charAt(i);
        }

        out.println(r.toLowerCase());
        out.close();

     }
}
