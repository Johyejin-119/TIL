package haruCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 2751
public class RadixSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arrRadix = new int[N];
        for (int i = 0; i < arrRadix.length; i++) {
            arrRadix[i] = Integer.parseInt(br.readLine());
        }

        int textSize = 2;
        radixSort(arrRadix, textSize);


    }

    private static void radixSort(int[] arrRadix, int textSize) {
        Queue<Integer>[] queue = new Queue[10];
        for (int i = 0; i < queue.length; i++) {
            queue[i] = new LinkedList<>();
        }

        int digit = 10; // 자릿수를 구하기 위해 나눠질 변수
        while(textSize != 0) {




            digit *= 10;
            textSize--;
        }

    }
}
