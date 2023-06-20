package harucoding.findingdecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1929
public class FindingDecimal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(str.nextToken());
        int N = Integer.parseInt(str.nextToken());
        br.close();
        
        int[] decimal = new int[N + 1];
        for (int i = 1; i < decimal.length; i++) {
            decimal[i] = i;           
        }
    }
}
