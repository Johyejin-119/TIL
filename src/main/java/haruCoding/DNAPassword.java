package haruCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 12891
public class DNAPassword {
    static int[] pwCheck;
    static int[] textCheck;
    static int checkWord;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(str.nextToken());
        int P = Integer.parseInt(str.nextToken());
        char[] texts = br.readLine().toCharArray();

        pwCheck = new int[4];
        textCheck = new int[4];
        checkWord = 0;
        int count = 0;

    }
}
