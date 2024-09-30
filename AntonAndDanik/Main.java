import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s = in.readLine();
        StringTokenizer t = new StringTokenizer(s);

        int n = Integer.parseInt(t.nextToken());
        s = in.readLine();

        int cont1 = 0, cont2 = 0;
        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'A')
                cont1++;
            else
                cont2++;
        }

        if (cont1 == cont2) {
            out.println("Friendship");
        } else if (cont1 < cont2) {
            out.println("Danik");
        } else {
            out.println("Anton");
        }
        out.close();
    }
}
