package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2525
public class OvenWatch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int a = Integer.parseInt(stringTokenizer.nextToken()); // 시
        int b = Integer.parseInt(stringTokenizer.nextToken()); // 분
        int time = Integer.parseInt(bufferedReader.readLine()); // 요리 시간

        if ((0 <= a) && (a <= 23) && (0 <= b) && (b <= 59)) {
            int cookH = (b + time) / 60;
            int cookM = (b + time) % 60;
            int night = a + cookH;

            if (night >= 24) {
                night -= 24;
                System.out.println((night) + " " + (cookM));
            } else {
                System.out.println((night) + " " + (cookM));
            }
        }
    }
}
