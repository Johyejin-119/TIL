package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2292
public class Honeycomb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int bangCount = 1;
        int range = 1;

        while (n > range) {
            System.out.println("1. before range: " + range + "2. after bangCount: "  + bangCount);
            range = range + (bangCount * 6);
            bangCount++;
            System.out.println("1. before range: " + range + "2. after bangCount: "  + bangCount);
        }

        System.out.println(bangCount);

    }
}
