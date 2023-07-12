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


        }
    }

    private static class Node {
        int end, weight; // 끝 노드, 가중치

        public Node(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }
    }
}
