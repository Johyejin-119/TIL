package harucoding.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 9934
public class CompleteBinaryTree {
    static int k;                           // 트리 높이    
    static int[] treeArr;                   // 트리 노드
    static List<ArrayList<Integer>> list;   // 결과값
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        treeArr = new int[(int) Math.pow(2, k) - 1]; // 완전 이진 트리의 노드 개수 2^k-1

        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < treeArr.length; i++) { // 노드 입력 받기
            treeArr[i] = Integer.parseInt(str.nextToken());
        }

        list = new ArrayList<>();
        for (int i = 0; i < k; i++) { // 트리 높이 만큼 리스트 초기화
            list.add(new ArrayList<>());
        }
        solve(0, treeArr.length - 1, 0); // 완전 이진 트리 탐색

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            for (int node : list.get(i)) {
                sb.append(node).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void solve(int s, int e, int depth) {
        if (depth == k) return; // 최상단 트리 레벨까지 탐색 완료
        int m = (s + e) / 2;
        list.get(depth).add(treeArr[m]); // 레벨별 노드 삽입

        solve(s, m - 1, depth + 1); // 하위 레벨, 왼쪽 자식 노드 재귀 탐색
        solve(m + 1, e, depth + 1); // 하위 레벨, 오른쪽 자식 노드 재귀 탐색
    }
}
