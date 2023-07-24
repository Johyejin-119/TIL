package harucoding.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 1753
public class ShortestRoute {
    static ArrayList<ArrayList<Node>> gList; // 인접 리스트
    static int distance[]; // 최단 거리 배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int V = Integer.parseInt(str.nextToken()); // 정점 개수
        int E = Integer.parseInt(str.nextToken()); // 간선 개수
        int K = Integer.parseInt(br.readLine()); // 시작 정점 번호
        int INF = Integer.MAX_VALUE;
        gList = new ArrayList<>();
        distance = new int[V + 1];

        for (int i = 0; i <= V; i++) { // 인접 리스트 초기화
            gList.add(new ArrayList<>());
        }
        Arrays.fill(distance, INF); // 최단 거리 배열 초기화

        for (int i = 0; i < E; i++) {
            str = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(str.nextToken()); // 간선 시작점
            int e = Integer.parseInt(str.nextToken()); // 간선 끝점
            int w = Integer.parseInt(str.nextToken()); // 가중치

            gList.get(s).add(new Node(e, w)); // 간선 정보(end, 가중치)를 인접 리스트에 저장
        }

        dijkstra(K, V); // 시작 정점, 정점 개수

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= V ; i++) {
            if (distance[i] == INF) sb.append("INF").append("\n");
            else sb.append(distance[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void dijkstra(int start, int v) {
        PriorityQueue<Node> pQueue = new PriorityQueue<Node>();
        boolean visited[] = new boolean[v + 1]; // 방문 배열
        pQueue.add(new Node(start, 0)); // 최초 시작점을 우선순위 큐에 삽입
        distance[start] = 0; // 최단 거리 배열의 첫 출발 노드는 0으로 초기화

        while (!pQueue.isEmpty()) {
            Node preNode = pQueue.poll(); // 현재 시작 노드
            int pre = preNode.end; // 탐색할 현재 노드

            // 현재 노드 방문 여부 체크
            if (visited[pre]) continue;
            visited[pre] = true;

            for (Node node : gList.get(pre)) {
                // 방문한 적 없는 노드 && (pre 노드의 최단 거리 배열 값 + pre 노드의 연결 노드의 가중치 < pre 노드의 연결 노드의 최단 거리 배열 값)
                if (!visited[node.end] && (distance[pre] + node.weight < distance[node.end])) {
                    distance[node.end] = distance[pre] + node.weight; // 값 업데이트
                    pQueue.add(new Node(node.end, distance[node.end]));
                }
            }
        }
    }

    private static class Node implements Comparable<Node> {
        int end;
        int weight;

        public Node(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return weight - o.weight; // 현재 노드의 가중치 값과 연결된 노드의 가중치 값을 비교
        }

    }
}
