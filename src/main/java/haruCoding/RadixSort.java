package haruCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2751
public class RadixSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arrRadix = new int[N];
        for (int i = 0; i < arrRadix.length; i++) {
            arrRadix[i] = Integer.parseInt(br.readLine());
        }

    }
}
