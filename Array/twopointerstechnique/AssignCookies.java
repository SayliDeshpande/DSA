import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {10,9,8,7}; // child
        int [] s = {5,6,7,8}; // cookie

        int count = findContentChildren(g,s);

        System.out.println(count);
    }

    private static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int pointG = 0;
        int pointS = 0;

        while (pointG<g.length && pointS<s.length) {
            if (g[pointG]<=s[pointS]) {
                pointG++;
                pointS++;
            } else {
                pointS++;
            }
        }

        return pointG;
    }
}
