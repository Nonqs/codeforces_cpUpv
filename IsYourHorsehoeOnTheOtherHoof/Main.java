package IsYourHorsehoeOnTheOtherHoof;
import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args)throws Exception {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s = in.readLine();
        StringTokenizer t = new StringTokenizer(s);

        int[] a = new int[4];
        int c = 0;

        for(int i = 0;i < 4; i++){
            a[i] = Integer.parseInt(t.nextToken());

            for(int j = 0; j < i;j++){
                if(a[i] == a[j]){
                    c++;
                    break;
                }
            }
        }

        out.println(c);
        out.close();

    }
}
