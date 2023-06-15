package harucoding.traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 2178
public class SearchMaze {
    static int[] de_x = {0, 1, 0, -1};
    static int[] de_y = {0, 1, 0, -1};
    static int[][] arrMaze; // 미로
    static int N, M; // 미로 크기
    static boolean[][] visited; // 방문 여부
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        arrMaze = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) { // 미로 배열에 데이터 삽입
            str = new StringTokenizer(br.readLine());
            String temp = str.nextToken();
            for (int j = 0; j < M; j++) {
                arrMaze[i][j] = Integer.parseInt(temp.substring(j, j + 1));
            }

        }
        BFS(0, 0);
    }

    private static void BFS(int a, int b) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {a, b}); // 시작 값(0,0)
        visited[a][b] = true; // 방문 여부 확인

        while (!queue.isEmpty()) {
            int[] pre = queue.poll(); // 현재 값

            for (int i = 0; i < 4; i++) { // 사방 탐색
                int x = pre[0] + de_x[i]; // 현재 값 + 0
                int y = pre[1] + de_y[i]; // 현재 값 + 1 == 아래로 한 칸 이동
            }
        }
    }
}
