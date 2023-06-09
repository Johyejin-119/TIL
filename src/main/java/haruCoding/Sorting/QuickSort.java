package haruCoding.Sorting;

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

        for (int i = 0; i < arrQuick.length; i++) {
            System.out.println(arrQuick[i]);
        }
    }

    private static void quickSort(int[] arrQuick, int start, int end) {
        if(start >= end) {
            return;
        }

        int pivot = partition(arrQuick, start, end);
        quickSort(arrQuick, start, pivot-1);
        quickSort(arrQuick, pivot+1, end);
    }

    private static int partition(int[] arrQuick, int start, int end) {
        int mid = (start + end) / 2;
        swap(arrQuick, start, mid);

        int pivot = arrQuick[start];
        int s = start, e = end;

        while(s < e) {
            while(pivot < arrQuick[e]) {
                e--;
            }

            while(s < e && pivot >= arrQuick[s]) {
                s++;
            }
            swap(arrQuick, s, e);
        }
        arrQuick[start] = arrQuick[s];
        arrQuick[s] = pivot;
        return s;
    }

    private static void swap(int[] arrQuick, int start, int mid) {
        int temp = arrQuick[mid];
        arrQuick[mid] = arrQuick[start];
        arrQuick[start] = temp;
    }
}
