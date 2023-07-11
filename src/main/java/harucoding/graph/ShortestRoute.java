package harucoding.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        int K = Integer.parseInt(br.readLine()); // 정점 번호
        int INF = Integer.MAX_VALUE;
        gList = new ArrayList<>();
        distance = new int[V + 1];

        for (int i = 1; i <= V; i++) { // 인접 리스트 초기화
            gList.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            str = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(str.nextToken()); // 간선 좌측
            int v = Integer.parseInt(str.nextToken()); // 간선 우측
            int w = Integer.parseInt(str.nextToken()); // 가중치

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
