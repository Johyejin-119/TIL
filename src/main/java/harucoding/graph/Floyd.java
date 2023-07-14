package harucoding.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 11404
public class Floyd {
    static int N;
    static int M;
    static int[][] arrCity;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 노드 수
        M = Integer.parseInt(br.readLine()); // 에지 수
        arrCity = new int[N + 1][N + 1]; // 최단 거리 리스트

        int INF = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) { // 최단 거리 리스트 초기화
            for (int j = 1; j <= N; j++) {
                arrCity[i][j] = INF;
                if (i == j) arrCity[i][j] = 0; // 시작 노드 == 도착 노드 -> 0으로 초기화
            }
        }

        StringTokenizer str;
        for (int i = 0; i < M; i++) {
            str = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(str.nextToken()); // 시작 노드
            int e = Integer.parseInt(str.nextToken()); // 도착 노드
            int w = Integer.parseInt(str.nextToken()); // 가중치

            // 시작-도착 노드가 같을 때 여러 가중치들 중, 가장 작은 값을 저장
            arrCity[s][e] = Math.min(arrCity[s][e], w);
        }
        FindPath(); // 최단 경로 찾기

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (arrCity[i][j] == INF){ arrCity[i][j] = 0; }
                sb.append(arrCity[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void FindPath() { // 플로이드-워셜 알고리즘
        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    // i -> j로 가는 모든 경유지들 k중, 최단 경로 값으로 업데이트
                    if (arrCity[i][j] > arrCity[i][k] + arrCity[k][j]) {
                        arrCity[i][j] = arrCity[i][k] + arrCity[k][j];
                    }
                }
            }
        }
    }
}
