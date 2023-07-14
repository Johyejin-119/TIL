package harucoding.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 11404
public class Floyd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 노드 수
        int M = Integer.parseInt(br.readLine()); // 에지 수
        int[][] arrCity = new int[N + 1][N + 1]; // 최단 거리 리스트

        int INF = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) { // 최단 거리 리스트 초기화
            for (int j = 1; j <= N; j++) {
                arrCity[i][j] = INF;
                if (i == j) arrCity[i][j] = 0; // 시작 노드 == 도착 노드 -> 0으로 초기화
            }
        }
    }
}
