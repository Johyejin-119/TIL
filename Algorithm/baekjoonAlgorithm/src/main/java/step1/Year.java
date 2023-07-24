package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 18108
public class Year {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int aYear = Integer.parseInt(bufferedReader.readLine()); // 불기 연도
        System.out.println(aYear - 543); // 서기 연도
    }
}
