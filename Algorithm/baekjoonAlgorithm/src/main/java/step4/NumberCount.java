package step4;

import java.io.*;

// 2577
public class NumberCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String z = String.valueOf(num); // 입력한 수를 곱한 것
        int[] count = new int[10]; // z 결과를 담을 곳

        for (int i = 0; i < z.length(); i++) {
            count[(z.charAt(i) - 48)]++;
            /*
            z = 1000000
            i = 0
            1. (z.charAt(0) - 48) -> (1-48) -> 10진법으로 (49-48) => 결과는 1
            2. count[1]++; => count 두번째 자리에서 0에서 1로 증가(++)

            z = 1000000
            i = 1
            1. (z.charAt(1) - 48) -> (0-48) -> 10진법으로 (48-48) => 결과는 0
            2. count[0]++; => count 첫번째 자리에서 0에서 1로 증가(++)

            그 후, i가 2부터 6까지 전부 숫자 0이기때문에
            count[0] 값이 5개 더 증가하여 총 6이 된다
            */

        }

        for (int i : count) {
            bw.write(String.valueOf(i) + "\n");
        }
        bw.close();
    }
}
