package harucoding.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1717
public class Union {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken()); // 노드 개수
        int M = Integer.parseInt(str.nextToken()); // 질의 개수
        int[] node = new int[N + 1]; // 노드 저장 배열
        for (int i = 0; i < N + 1; i++) {
            node[i] = i;
        }
        for (int i = 0; i < M; i++) { // 질의 계산
            str = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(str.nextToken()); // 질의 유형
            int a = Integer.parseInt(str.nextToken()); // 노드
            int b = Integer.parseInt(str.nextToken()); // 노드

            if (type == 0) { // 합집합 union
                union(a, b);
            } else {

            }
        }
    }
}
