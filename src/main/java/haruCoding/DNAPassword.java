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

        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            pwCheck[i] = Integer.parseInt(str.nextToken());
            if (pwCheck[i] == 0) checkWord++;
        }

        for (int i = 0; i < P; i++) {
            TextAndPwCheckingAdd(texts[i]);
        }

        if (checkWord == 4) count++;

    }

    private static void TextAndPwCheckingAdd(char text) {
        switch (text) {
            case 'A':
                textCheck[0]++;
                if (textCheck[0] == pwCheck[0]) checkWord++;
                break;
            case 'C':
                textCheck[1]++;
                if (textCheck[1] == pwCheck[1]) checkWord++;
                break;
            case 'G':
                textCheck[2]++;
                if (textCheck[2] == pwCheck[2]) checkWord++;
                break;
            case 'T':
                textCheck[3]++;
                if (textCheck[3] == pwCheck[3]) checkWord++;
                break;
        }
    }
}
