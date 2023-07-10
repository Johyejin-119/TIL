package harucoding.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1753
public class ShortestRoute {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int V = Integer.parseInt(str.nextToken()); // 정점 개수
        int E = Integer.parseInt(str.nextToken()); // 간선 개수

        str = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(str.nextToken()); // 정점 번호

        for (int i = 0; i < E; i++) {
            str = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(str.nextToken()); // 간선 좌측
            int v = Integer.parseInt(str.nextToken()); // 간선 우측
            int w = Integer.parseInt(str.nextToken()); // 가중치

        }


    }
}
