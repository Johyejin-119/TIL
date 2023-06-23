package harucoding.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 1707
public class BipartiteGraph {
    static ArrayList<Integer>[] gData;  // 그래프 데이터 저장될 인접 리스트
    static int[] check;                 // 이분 그래프 체크
    static boolean[] visited;           // 방문 기록
    static boolean result;              // 이분그래프 판별 여부

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        StringTokenizer str;
        for (int i = 0; i < T; i++) {
            str = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(str.nextToken()); // 노드 개수
            int E = Integer.parseInt(str.nextToken()); // 에지 개수

            gData = new ArrayList[N + 1]; // 노드는 1번부터 존재 -> 배열 인덱스 1부터 N+1
            check = new int[N + 1];
            visited = new boolean[N + 1];
            result = true;

            for (int j = 1; j <= N; j++) { // 인접 리스트 초기화
                gData[j] = new ArrayList<Integer>();
            }

            for (int j = 0; j < E; j++) { // 그래프 데이터 저장(에지 기준 시작 노드-끝 노드)
                str = new StringTokenizer(br.readLine(), " ");
                int start = Integer.parseInt(str.nextToken()); // 시작 노드
                int end = Integer.parseInt(str.nextToken()); // 끝 노드

                // 무방향 그래프이므로 양쪽 전부 add
                gData[start].add(end);
                gData[end].add(start);
            }

            for (int j = 1; j <= N; j++) { // 노드별 DFS 실행 -> 이분 그래프 판별
                if (result) { // 이분 그래프인 경우
                    DFS(1);
                } else {
                    break;
                }
            }

            if (result) { // 마지막까지 이분 그래프인 경우
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static void DFS(int n) {
        visited[n] = true; // 시작 노드 n
        for (Integer i : gData[n]) {
            if (!visited[i]) { // 연결된 현재 노드가 방문한 노드가 아닌 경우
                check[i] = (check[n] + 1) % 2; // 현재 노드 check[i]는 바로 직전 노드 check[n]와 다른 집합으로 분류
                DFS(i);
            } else {
                if (check[i] == check[n]) { // 인접한 두 노드가 같은 집합인 경우
                    result = false; // 이분 그래프 NO
                }
            }
        }
    }
}
