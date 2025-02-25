
public class Problem {
    public static boolean capicua(char[] n, int i, int j) {
        if (i == j || i > j) {
            return true;
        } else {
            if (n[i] == n[j]) {
                return capicua(n, i + 1, j - 1);
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        char[] n = { 'c', 's', 's', 'c' };
        int i = 0;
        int j = n.length - 1;
        System.out.println(capicua(n, i, j));
    }
}