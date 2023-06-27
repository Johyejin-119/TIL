package harucoding.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 2252
public class LineUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken()); // 학생 수(노드 수)
        int M = Integer.parseInt(str.nextToken()); // 비교 횟수
        ArrayList<ArrayList<Integer>> data = new ArrayList<>(); // 인접 리스트
        int indegree[] = new int[N + 1]; // 진입 차수

        for (int i = 1; i <= N; i++) { // 인접 리스트 초기화
            data.add(new ArrayList<>());
        }

    }
}
