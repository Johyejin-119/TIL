package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2839
public class SugarDelivery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if ((N%5) == 0) {
            System.out.println(N/5);
        } else {
            System.out.println((N/5)+((N%5)%3+1));
        }
    }
}
