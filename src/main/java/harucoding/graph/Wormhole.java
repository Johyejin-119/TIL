package harucoding.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

// 1865
public class Wormhole {
    static ArrayList<ArrayList<Node>> gData;    // 에지 정보 리스트
    static int dist[];                          // 최단 거리 배열
    static int N, M, W;                         // 노드 수, 도로 수, 웜홀 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TC = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        StringTokenizer str;
        for (int i = 0; i < TC; i++) {
            str = new StringTokenizer(br.readLine());
            N = Integer.parseInt(str.nextToken()); // 노드 수
            M = Integer.parseInt(str.nextToken()); // 에지 수
            W = Integer.parseInt(str.nextToken()); // 에지 수(음수 존재)
            gData = new ArrayList<>();
            dist = new int[N + 1];

            for (int j = 0; j <= N ; j++) { // 에지 정보 리스트 초기화
                gData.add(new ArrayList<>());
            }

            int INF = Integer.MAX_VALUE;
            Arrays.fill(dist, INF); // 최단 거리 배열 초기화

            for (int j = 0; j < M + W; j++) {
                str = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(str.nextToken()); // 시작 노드
                int e = Integer.parseInt(str.nextToken()); // 끝 노드
                int weight = Integer.parseInt(str.nextToken()); // 가중치

                if (j < M) { // 도로 - 양방향, 음수X
                    gData.get(s).add(new Node(e, weight));
                    gData.get(e).add(new Node(s, weight));
                } else { // 웜홀 - 단방향, 음수O
                    gData.get(s).add(new Node(e, -weight));
                }
            }
            boolean cycleCheck = false; // 음수 사이클 체크
            for (int j = 1; j <= N; j++) {
                if (bellmanFord(i)) { // 음수 사이클 있음
                    cycleCheck = true;
                    System.out.println("YES");
                    break;
                }
            }
            if (!cycleCheck) { // 음수 사이클 없음
                System.out.println("NO");
            }

        }
    }

    private static boolean bellmanFord(int node) {
        dist[node] = 0; // 첫 시작 노드 초기화
        boolean upCheck = false; // 최단 거리 dist 갱신 여부
        int INF = Integer.MAX_VALUE;

        for (int i = 1; i <= N - 1; i++) { // '노드 수 -1', 에지 사용 횟수만큼 최단 거리 구하기
            upCheck = false;
            for (int j = 1; j <= N; j++) { // 모든 에지 순회
                for (Node pre : gData.get(j)) {
                    if (dist[j] != INF && dist[j] + pre.weight < dist[pre.end]) {
                        dist[pre.end] = dist[j] + pre.weight;
                        upCheck = true; // 최단 거리 값 갱신
                    }
                }
            }
            if (!upCheck) break; // 더 이상 갱신할 최단 거리 값이 없는 경우
        }
        
        if (upCheck) {
            for (int i = 1; i <= N; i++) { // '노드 수'만큼 최단 거리 값 갱신되는 경우 == 음수 사이클 발생
                for (Node pre : gData.get(i)) {
                    if (dist[i] != INF && dist[i] + pre.weight < dist[pre.end]) {
                        dist[pre.end] = dist[i] + pre.weight;
                        return true; // 음수 사이클 발생(YES)
                    }
                }
            }
        }
        return false;
    }

    private static class Node {
        int end, weight; // 끝 노드, 가중치

        public Node(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }
    }
}
