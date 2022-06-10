package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 9498
public class TestResult {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());

        if (100 >= a && a >= 0) {
            if (a < 60) {
                System.out.println("F");
            } else if (a < 70) {
                System.out.println("D");
            } else if (a < 80) {
                System.out.println("C");
            } else if (a < 90) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        } else {
            System.out.println("점수는 0~100 사이어야 합니다.");
        }
    }
}
