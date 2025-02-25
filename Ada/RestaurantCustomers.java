package Ada;

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class RestaurantCustomers {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(t.nextToken());

        int[][] tm = new int[n][2];
        for(int i = 0; i < n; i++){
            t = new StringTokenizer(in.readLine());
            tm[i][0] = Integer.parseInt(t.nextToken());
            tm[i][1] = Integer.parseInt(t.nextToken());
        }

        int m = 0;
        int temp = 0;

        for(int i = 0; i < n; i++){
            temp = 0;
            for(int j = 0; j < n;j++){
                if((tm[i][0] <= tm[j][0] || tm[i][0] <= tm[j][1]) && (tm[i][1] >= tm[j][0] ||tm[i][1] >= tm[j][1])){
                    temp++;
                }
            }
            m = Math.max(m, temp);
        }

        out.println(m);
        out.close();

    }
}
