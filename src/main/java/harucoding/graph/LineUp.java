package harucoding.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
        for (int i = 0; i < M; i++) {
            str = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(str.nextToken()); // 학생 A 번호
            int end = Integer.parseInt(str.nextToken()); // 학생 B 번호
            data.get(start).add(end); // 인접 리스트 데이터 저장
            indegree[end]++; // A부터 출력시키기 위해, B의 진입 차수 배열을 ++
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) { // 진입 차수가 0인 노드
                queue.offer(i); // 진입 차수 0인 노드부터 위상 정렬 수행
            }
        }

    }
}
