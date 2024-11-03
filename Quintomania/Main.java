package Quintomania;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s = in.readLine();
        StringTokenizer t = new StringTokenizer(s);

        int test = Integer.parseInt(t.nextToken());

        for(int i = 0; i < test; i++){

            s = in.readLine();
            t = new StringTokenizer(s);
            int n = Integer.parseInt(t.nextToken());

            s = in.readLine();
            t = new StringTokenizer(s);
            int[] a = new int[n];

            for(int j = 0; j < n; j++){
                a[j] = Integer.parseInt(t.nextToken());
            }

            for(int j = 0; j < n - 1; j++){
                int sum = a[j] - a[j + 1];
                if(sum < 0) sum = sum - 2*sum;
                if(sum != 5 && sum != 7){
                    out.println("NO");
                    break;
                } else if(j == n - 2){
                    out.println("YES");
                    break;
                }
            }

        }

        out.close();
    }
}
