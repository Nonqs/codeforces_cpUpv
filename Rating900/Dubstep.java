package Rating900;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Dubstep {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        String w = t.nextToken();
        w = w.replaceAll("WUB", " ").trim().replaceAll(" +", " ");

        out.println(w);
        out.close();
    }
}
