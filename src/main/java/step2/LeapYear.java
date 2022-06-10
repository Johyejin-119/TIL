package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2753
public class LeapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());

        if ((a % 4 == 0) && !(a % 100 == 0) || (a % 400 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
