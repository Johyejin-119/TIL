package harucoding.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1717
public class Union {
    static int[] node;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken()); // 노드 개수
        int M = Integer.parseInt(str.nextToken()); // 질의 개수
        node = new int[N + 1]; // 노드 저장 배열
        for (int i = 0; i < N + 1; i++) {
            node[i] = i;
        }
        for (int i = 0; i < M; i++) { // 질의 계산
            str = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(str.nextToken()); // 질의 유형
            int a = Integer.parseInt(str.nextToken()); // 노드
            int b = Integer.parseInt(str.nextToken()); // 노드

            if (type == 0) { // 합집합 union 연산 수행 -> 두 노드 연결
                union(a, b);
            } else { // 두 노드의 합집합 판별
                boolean re = checkResult(a, b);
                if (re) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static void union(int a, int b) { // 대표 노드끼리 연결하기
        a = find(a);
        b = find(b);
        if (a != b) { // 대표 노드가 다른 경우
            node[b] = a; // 두 노드 연결하기(합집합)
        }
    }

    private static int find(int index) { // 대표 노드 찾기
        if (index == node[index]) return index; // 배열의 index 와 value 가 일치
        else {
            return node[index] = find(node[index]); // value 를 index 로 바꿔서 재귀적으로 찾기 -> 찾은 대표 노드 값으로 업데이트
        }
    }

    private static boolean checkResult(int a, int b) { // 대표 노드가 같은 지 확인하기
        a = find(a);
        b = find(b);
        return a == b;
    }
}
