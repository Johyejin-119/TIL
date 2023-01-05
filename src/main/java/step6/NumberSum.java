package step6;

import java.io.*;

// 11720
public class NumberSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        // array
        String[] numbers = br.readLine().split("");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        System.out.println(sum);
    }
}
