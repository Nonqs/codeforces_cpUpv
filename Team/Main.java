package Team;
import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s = in.readLine();
        StringTokenizer t = new StringTokenizer(s);

        int n = Integer.parseInt(t.nextToken());

        int cont = 0;
        int cont2 = 0;
        
        for(int i = 0; i < n; i++){
            s = in.readLine();
            t = new StringTokenizer(s);
            int[] solutions = new int[3];

            for(int j = 0; j < 3;j++){
                solutions[j] = Integer.parseInt(t.nextToken());

                if(solutions[j] == 1){
                    cont ++;
                }
                
            }
            if(cont >= 2){
                cont2 ++;
            }

            cont =0;

        }

        out.println(cont2);
        out.close();

    }
}
