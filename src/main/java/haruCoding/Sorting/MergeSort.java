package haruCoding.Sorting;

import java.io.*;

// 2751
public class MergeSort {

    static int[] tempArrMerge;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arrMerge = new int[N];
        tempArrMerge = new int[N];

        for (int i = 0; i < arrMerge.length; i++) {
            arrMerge[i] = Integer.parseInt(br.readLine());
        }
        mergeSorting(arrMerge, 0, arrMerge.length - 1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : arrMerge) {
            bw.write(i + "\n");
        }
        br.close();
        bw.close();
    }

    private static void mergeSorting(int[] arrMerge, int start, int end) {
        int mid;
        if (start < end) {
            mid = (start + end) / 2; // 중앙값
            mergeSorting(arrMerge, start, mid); // mid 기준 왼쪽 데이터 집합
            mergeSorting(arrMerge, mid + 1, end); // mid 기준 오른쪽 데이터 집합
            merge(arrMerge, start, mid, end); // 나눠진 데이터 집합을 병합
        }
    }

    private static void merge(int[] arrMerge, int start, int mid, int end) {
        int left_p = start;
        int right_p = mid + 1;
        int resultIndex = start;
        while (left_p <= mid && right_p <= end) { // 좌측 && 우측 부분 집합의 정렬이 완료될 때까지
            if (arrMerge[left_p] <= arrMerge[right_p]) { // 좌측 부분 집합의 데이터가 작은 경우
                tempArrMerge[resultIndex++] = arrMerge[left_p++];
            } else {
                tempArrMerge[resultIndex++] = arrMerge[right_p++];
            }
        }
        if (left_p > mid) { // 좌측 부분 집합 데이터의 정렬이 완료됐을 때
            for (int i = right_p; i <= end; i++) {
                tempArrMerge[resultIndex++] = arrMerge[i]; // 우측 데이터 그대로 저장
            }
        } else { // 우측 부분 집합 데이터의 정렬이 완료됐을 때
            for (int i = left_p; i <= mid; i++) {
                tempArrMerge[resultIndex++] = arrMerge[i]; // 좌측 데이터 그대로 저장
            }
        }
        for (int i = start; i <= end; i++) {
            arrMerge[i] = tempArrMerge[i];
        }
    }
}
