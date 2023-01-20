package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2869
public class SnailGoingUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());
        int V = Integer.parseInt(str.nextToken());
        int day = (int) Math.ceil ((double) (V-A)/(A-B));
        System.out.println(day + 1);
    }
}
