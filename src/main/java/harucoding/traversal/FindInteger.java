package harucoding.traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 1920
public class FindInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer str = new StringTokenizer(br.readLine(), " ");;
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        str = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(str.nextToken());
            boolean result = false;

            int start = 0; // 시작 인덱스
            int end = A.length - 1; // 마지막 인덱스
            while (start <= end) { // 이진 탐색
                int mid = (start + end) / 2; // 중앙값 인덱스
                int m_value = A[mid]; // 중앙값

                if (m_value > target) {
                    end = mid - 1; // 좌측 집합의 end - 1
                } else if (m_value < target) {
                    start = mid + 1; // 우측 집합의 start + 1
                } else {
                    result = true; // A[]에 target 값 존재
                    break;
                }
            }
            if (result) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        br.close();
    }
}
