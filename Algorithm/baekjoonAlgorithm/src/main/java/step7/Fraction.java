package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1193
public class Fraction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int cnt = 0;
        int n = 0;
        while (true) {
            n++;
            cnt +=n;
            System.out.println("n: " + n + ", cnt: " + cnt);

            if(cnt>=x) {
                System.out.println("cnt: " + cnt + ", x: " + x + ", n: " + n);
                if(n%2==0) {
                    System.out.println((x - cnt + n) + "/" + (cnt - x + 1));
                }else {
                    System.out.println((cnt - x + 1) + "/" + (x - cnt + n));
                }
                break;
            }
        }
    }
}
