package harucoding.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1541
public class LostParenthesis {
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ex = br.readLine(); // 수식

        String[] input = ex.split("-"); // -기준으로 수식 분할
        for (int i = 0; i < input.length; i++) {
            int sum_result = Sum(input[i]); // 분할된 수식 내 +연산만 수행
            if (i == 0) {
                result += sum_result;
            } else {
                result -= sum_result;
            }
        }
        System.out.println(result);
    }

    private static int Sum(String input) {
        int plus = 0;
        String[] sumInput = input.split("'+'"); // +기준으로 수식 분할
        for (int i = 0; i < sumInput.length; i++) {
            plus += Integer.parseInt(sumInput[i]); // 분할된 수식 더하기
        }
        return plus; // 분할된 일부 수식의 전체 합
    }
}
