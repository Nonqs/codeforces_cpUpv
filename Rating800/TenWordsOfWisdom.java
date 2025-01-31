package Rating800;
import java.util.*;
import java.io.*;
public class TenWordsOfWisdom{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());
        while (test-- > 0) {
            t = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(t.nextToken());
            int ind = 0;
            int l = 0;

            for(int i = 1; i <= n; i++){
                t = new StringTokenizer(in.readLine());
                int a = Integer.parseInt(t.nextToken());
                int b = Integer.parseInt(t.nextToken());
                if(a <= 10 && b > l){
                    ind = i;
                    l = b;
                }
            }
            out.println(ind);

        }

        out.close();
    }
}