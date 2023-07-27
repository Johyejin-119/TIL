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

    }
}
