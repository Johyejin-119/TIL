package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 19532
public class MathOnlineClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());
        int c = Integer.parseInt(str.nextToken());
        int d = Integer.parseInt(str.nextToken());
        int e = Integer.parseInt(str.nextToken());
        int f = Integer.parseInt(str.nextToken());

        System.out.println(simultaneousEquations(a, b, c, d, e, f));
    }

    private static String simultaneousEquations(int a, int b, int c, int d, int e, int f) {
        for (int x = -999; x < 1000; x++) {
            for (int y = -999; y < 1000; y++) {
                if ((a * x) + (b * y) == c && (d * x) + (e * y) == f) return x + " " + y;
            }
        }
        return "Not found: x, y values";
    }
}
