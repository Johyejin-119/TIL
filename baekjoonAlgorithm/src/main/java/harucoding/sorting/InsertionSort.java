package harucoding.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2751
public class InsertionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] insertSort = new int[N];

        for (int i = 0; i < N; i++) {
            insertSort[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < insertSort.length; i++) {
            int origin = insertSort[i];
            int j = i - 1;
            while (j >= 0 && origin < insertSort[j]) {
                insertSort[j+1] = insertSort[j];
                j--;
            }
            insertSort[j + 1] = origin;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < insertSort.length; i++) {
            sb.append(insertSort[i]).append("\n");
        }
        System.out.println(sb);
    }
}