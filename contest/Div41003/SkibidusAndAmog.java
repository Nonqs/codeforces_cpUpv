
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class SkibidusAndAmog {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        int test = Integer.parseInt(t.nextToken());
        
        while (test-- > 0) {
            t = new StringTokenizer(in.readLine());
            String n = t.nextToken();

            out.println(n.substring(0, n.length()-2)+"i");
        }
        out.close();
    }
}
