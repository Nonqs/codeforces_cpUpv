package Rating900;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class AntonAndPolyhedrons {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer t = new StringTokenizer(in.readLine());
        HashMap<String, Integer> p = new HashMap<>();
        p.put("Tetrahedron", 4);
        p.put("Cube", 6);
        p.put("Octahedron", 8);
        p.put("Dodecahedron", 12);
        p.put("Icosahedron", 20);

        int n = Integer.parseInt(t.nextToken());
        int c = 0;
        for (int i = 0; i < n; i++) {
            t = new StringTokenizer(in.readLine());
            c += p.get(t.nextToken());
        }

        out.println(c);
        out.close();
    }
}
