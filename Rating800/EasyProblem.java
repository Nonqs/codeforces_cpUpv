package Rating800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class EasyProblem {
    
     public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());
        boolean e = true;
        t = new StringTokenizer(in.readLine());
        while(n-- > 0){
            if(Integer.parseInt(t.nextToken()) == 1) {
                e = false;
                break;
            }
        }


        if(e){
            out.println("EASY");
        }else{
            out.println("HARD");
        }

        out.close();    
     }
}
