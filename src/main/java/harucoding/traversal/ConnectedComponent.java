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
        int M = Integer.parseInt(str.nextToken()); // 에지 개수
        adjList = new ArrayList[N];
        visited = new boolean[N];


        for (int i = 0; i < N; i++) {
            adjList[i] = new ArrayList<Integer>();
        }

        str = new StringTokenizer(br.readLine(), " ");

    }
}
