package haruCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1427
public class SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] sectSort = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            sectSort[i] = Integer.parseInt(N.substring(i, i+1));
        }
        for (int i = 0; i < N.length(); i++) {
            int max = i;
            for (int j = i+1; j < N.length(); j++) {
                if (sectSort[j] > sectSort[max]) max = j;
            }
            if (sectSort[i] < sectSort[max]) { // swap
                int temp = sectSort[i];
                sectSort[i] = sectSort[max];
                sectSort[max] = temp;
            }
        }
    }
}
