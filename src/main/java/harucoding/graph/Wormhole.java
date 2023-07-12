package harucoding.graph;

import java.util.ArrayList;

// 1865
public class Wormhole {
    static ArrayList<ArrayList<Node>> gData;    // 에지 정보 리스트
    static int dist[];                          // 최단 거리 배열
    static final int INF = Integer.MAX_VALUE;   // 최단 거리 배열 초기값
    static int N, M, W;                         // 노드 수, 도로 수, 웜홀 수

    public static void main(String[] args) {

    }

    private static class Node {
        int end, weight; // 끝 노드, 가중치

        public Node(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }
    }
}
