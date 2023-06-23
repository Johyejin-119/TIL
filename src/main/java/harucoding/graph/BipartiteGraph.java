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
        }
    }
}
