package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2588
public class AMultiplicationB2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 472
        int a = Integer.parseInt(bufferedReader.readLine()); // 472

        // 385
        String[] str = bufferedReader.readLine().split("");
        int x = Integer.parseInt(str[0]); // 3
        int y = Integer.parseInt(str[1]); // 8
        int z = Integer.parseInt(str[2]); // 5

        int mpz = a * z;
        int mpy = a * y;
        int mpx = a * x;

        int sum = mpz + (mpy * 10) + (mpx * 100);

        System.out.println(mpz);
        System.out.println(mpy);
        System.out.println(mpx);
        System.out.println(sum);

    }
}
