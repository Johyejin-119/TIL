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

        radixSort(arrRadix);


    }

    private static void radixSort(int[] arrRadix) {
        Queue<Integer>[] queue = new Queue[10];
        for (int i = 0; i < queue.length; i++) {
            queue[i] = new LinkedList<>();
        }

        int textSize = getTextSize(arrRadix);
        int digit = 1; // 자릿수를 구하기 위해 나눠질 변수
        for (int size = 0; size < textSize; size++) {
            // 자릿수 기준으로 큐에 값 넣기
            for (int i = 0; i < arrRadix.length; i++) {
                int qIndex = (arrRadix[i] / digit) % 10;
                queue[qIndex].add(arrRadix[i]);
            }

            //queue[0]~[9] 순서로 정렬된 값 빼오기
            for (int i = 0; i < arrRadix.length; i++) {
                int aIndex = 0;
                while (queue[aIndex].isEmpty()) {
                    aIndex++;
                }
                arrRadix[i] = queue[aIndex].poll();
            }
            digit *= 10;
        }

    }

    private static int getTextSize(int[] arrRadix) {
        int max = 0;
        for (int i = 0; i < arrRadix.length; i++) {
            int size = (int)Math.log10((double)arrRadix[i])+1;
            if (max < size) max = size;
        }
        return max; // 최대 자릿수
    }
}
