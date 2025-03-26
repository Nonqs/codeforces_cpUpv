package Rating900;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ChatRoom {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        String s = t.nextToken();
        char[] c = { 'h', 'e', 'l', 'l', 'o' };
        int cont = 0;

        for (int i = 0; i < s.length(); i++) {
            if (cont == 5)
                break;
            if (c[cont] == s.charAt(i))
                cont++;
        }

        if (cont == 5) {
            out.println("YES");
        } else {
            out.println("NO");
        }

        out.close();
    }
}
