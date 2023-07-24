package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 10757
public class BigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        BigInteger A = new BigInteger(str.nextToken());
        BigInteger B = new BigInteger(str.nextToken());
        System.out.println(String.valueOf(A.add(B)));
    }
}
