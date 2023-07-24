package harucoding.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2609
public class GCDLCM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());

        int result = GCD(A, B);
        System.out.println(result); // 최대공약수
        System.out.println(A * B / result); // 최소공배수
    }

    private static int GCD(int a, int b) { // 유클리드 호제법으로 최대공약수 구하기
        if (b == 0) { // B가 0일 때 A가 최대공약수
            return a;
        } else {
            return GCD(b, a % b); // 재귀 형식
        }
    }
}
