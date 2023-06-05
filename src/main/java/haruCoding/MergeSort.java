package haruCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2751
public class MergeSort {

    static int[] arrMerge;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arrMerge = new int[N];

        for (int i = 0; i < N; i++) {
            arrMerge[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(arrMerge, 0, arrMerge.length-1);
    }

    private static void mergeSort(int[] arrMerge, int start, int end) {
        int mid = 0;
        if (start < end) {
            mid = (start + end) / 2;
            mergeSort(arrMerge, start, mid);
            mergeSort(arrMerge, mid + 1, end);
            merge(arrMerge, start, mid, end);
        }
    }

    private static void merge(int[] arrMerge, int start, int mid, int end) {

    }
}
