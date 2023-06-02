package haruCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2751
public class QuickSort {
    static int[] arrQuick;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arrQuick = new int[N];

        for (int i = 0; i < N; i++) {
            arrQuick[i] = Integer.parseInt(br.readLine());
        }

        quickSort(arrQuick, 0, N - 1);

    }

    private static void quickSort(int[] arrQuick, int start, int end) {
        if(start >= end) {
            return;
        }

        int pivot = partition(arrQuick, start, end);
    }

    private static int partition(int[] arrQuick, int start, int end) {

    }
}
