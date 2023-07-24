package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2884
public class AlarmClock {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int h = Integer.parseInt(stringTokenizer.nextToken()); // 시간
        int m = Integer.parseInt(stringTokenizer.nextToken()); // 분

        if (0 <= h && h <= 23 && 0 <= m && m <= 59) {
            if (m >= 45) {
                // 45분 이상인 경우
                System.out.print(h + " " + (m - 45));
            } else {
                // 45분 이하인 경우
                int m2 = m - 45;

                if (h == 0) {
                    // h 가 자정(0시)인 경우
                    int h2 = 23;
                    System.out.print((h2) + " " + (60 + m2));
                } else {
                    // h 가 1~23시인 경우
                    System.out.print((h -1) + " " + (60 + m2));
                }
            }
        }
    }
}
