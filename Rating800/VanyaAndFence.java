package Rating800;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class VanyaAndFence {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = in.readLine();
        StringTokenizer token = new StringTokenizer(s);

        int n = Integer.parseInt(token.nextToken()),
                h = Integer.parseInt(token.nextToken());

        s = in.readLine();
        token = new StringTokenizer(s);
        int cont = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(token.nextToken());
            if (a[i] > h)
                cont += 2;
            else
                cont++;
        }

        out.println(cont);
        out.close();
    }

}
