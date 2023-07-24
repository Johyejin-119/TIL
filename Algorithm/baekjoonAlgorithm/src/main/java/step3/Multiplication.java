package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2739
public class Multiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        if (1 <= a && a <= 9) {
            for (int i = 1; i < 10; i++) {
                System.out.println(a + " * " + i + " = " + (a * i));
            }
        }
    }
}
