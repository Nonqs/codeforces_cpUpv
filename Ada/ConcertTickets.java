package Ada;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ConcertTickets {


    
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());
        int m = Integer.parseInt(t.nextToken());

        int[] tk = new int[n];
        int[] p = new int[m];

        t = new StringTokenizer(in.readLine());
        for(int i = 0; i < n; i++){
            tk[i] = Integer.parseInt(t.nextToken());
        }

        t = new StringTokenizer(in.readLine());
        for(int i = 0; i < m; i++){
            p[i] = Integer.parseInt(t.nextToken());
        }

        int temp = 0;
        for (int i = 0; i < tk.length; i++)   
         {     
            for (int j = i+1; j < tk.length; j++)    
            {     
               if(tk[i] < tk[j]) 
               {    
                   temp = tk[i];    
                   tk[i] = tk[j];    
                   tk[j] = temp;    
               }     
            }     
        }   

        for(int i = 0; i < p.length;i++){
            for(int j = 0; j < tk.length;j++){
                if(p[i] >= tk[j] && tk[j] != 0){
                    out.println(tk[j]);
                    tk[j] = 0;
                    break;
                }else if(j == tk.length-1){
                    out.println(-1);
                    break;
                }
            }
        }

        out.close();


    }
}
