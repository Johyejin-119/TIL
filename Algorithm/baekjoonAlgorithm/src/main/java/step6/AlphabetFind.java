package step6;

import java.io.*;
import java.util.Arrays;

public class AlphabetFind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /**
         * 1. 기존 알파벳 목록을 세팅한다(-1로 초기화)
         * 2. baekjoon을 입력 받는다 - s
         * 3. s의 chatAt() 값을 하나씩 꺼낸 후,
         *    꺼낸 값(alpha)이 b라면 alphabet[]의 두번째 인덱스에
         *    s의 꺼낸 값의 위치를 넣는다
         * 4. 중복된 값이 있다면?(= 즉 -1이 아니라면? = 이미 변경 되었다면?)
         *    3번을 수행하지 않는다
         * */
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char alpha = s.charAt(i);

            if (alphabet[alpha - 'a'] == -1) {
                alphabet[alpha - 'a'] = i;
            }
        }

        for (int i : alphabet) {
            System.out.print(i + " ");
        }
    }
}
