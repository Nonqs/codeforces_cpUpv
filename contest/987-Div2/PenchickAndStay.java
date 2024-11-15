import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class PenchickAndStay {
    //TODO: correct errors
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());

        while (test-- > 0) {

            t = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(t.nextToken());
            int[] a = new int[n];

            t = new StringTokenizer(in.readLine());

            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(t.nextToken());

            int prev = a[n - 1];

            for(int i = n - 2; i >= 0; i--){

                if(a[i] > prev){

                 if(prev - a[i] == 1 || -(prev - a[i])==1){
                    
                    a[i + 1] = a[i];
                    a[i] = prev;
                    i = n - 2;
                 }

                }else{
                    prev = a[i];
                }

            }

            prev = a[0];
            boolean tr = false;
            for (int i = 1; i < n; i ++) {
                if(a[i] > prev){
                    prev = a[i];
                    tr = true;

                }else{
                    tr = false;
                }
                
            }

            if(tr == true){
                out.println("YES");
            }else{
                out.println("NO");
            }

        }

        out.close();
    }
}
