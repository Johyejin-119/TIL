package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10250
public class ACMHotel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int floor = 0;
        int number = 1;

        for (int i = 0; i < t; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(str.nextToken());
            int W = Integer.parseInt(str.nextToken());
            int N = Integer.parseInt(str.nextToken());

            for (int j = 0; j < N; j++) {
                if (floor > H-1) {
                    floor = 0;
                    if (number < W) number++;
                }
                ++floor;
            }
            sb.append(floor + String.format("%1$02d", number)).append('\n');
            floor = 0;
            number = 1;
        }
        System.out.println(sb);
    }
}
