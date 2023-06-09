package harucoding.traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 11724
public class ConnectedComponent {
    static ArrayList<Integer>[] adjList; // 인접 리스트
    static boolean[] visited; // 방문 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(str.nextToken()); // 노드 개수
        int M = Integer.parseInt(str.nextToken()); // 간선 개수
        adjList = new ArrayList[N];
        visited = new boolean[N];


        for (int i = 0; i < N; i++) {
            adjList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            str = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(str.nextToken()); // 간선의 양 끝점 노드
            int v = Integer.parseInt(str.nextToken()); // 간선의 양 끝점 노드

            // 무방향 그래프이므로, 양쪽 방향을 전부 add
            adjList[u].add(v);
            adjList[v].add(u);
        }


    }
}
