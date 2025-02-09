import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SkibidusandOhio {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());

        while (test-- > 0) {
            t = new StringTokenizer(in.readLine());
            String n = t.nextToken();
            char l = n.charAt(0);

            for (int i = 1; i < n.length(); i++) {
                if (l == n.charAt(i) ) {
                    out.println(1);
                    break;
                }else if(i == n.length()-1){
                    out.println(n.length());
                    break;
                }
                l = n.charAt(i);
            }

            if(n.length() == 1){
                out.println(1);
            }
        }
        out.close();
    }
}
