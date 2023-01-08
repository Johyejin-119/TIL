package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordStudy {
    public static void main(String[] args) throws IOException {

        int[] count = new int[26];
        int s = System.in.read();
        while (s > 64) {
            if (s < 91) {
                count[s - 65]++;
            } else {
                count[s - 97]++;
            }
            s = System.in.read();
        }

        int max = -1;
        int ch = -2; // ? == 63

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                ch = i;
            } else if (count[i] == max) {
                ch = -2;
            }
        }
        System.out.println((char) (ch + 65));

/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                count[s.charAt(i) - 'A']++;
            } else {
                count[s.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                ch = (char) (i + 65);
            } else if (count[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
*/

    }
}
