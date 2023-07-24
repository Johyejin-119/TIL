package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2908
public class Constant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine()," ");

        int A = Integer.parseInt(new StringBuilder(str.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(str.nextToken()).reverse().toString());
        System.out.println(A > B ? A : B);
    }
}
