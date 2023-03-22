package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 10814
public class SortByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, String> members = new HashMap<>();

        StringTokenizer str;
        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine(), " ");
            members.put(Integer.valueOf(str.nextToken()), str.nextToken());
        }
        br.close();

        List<Integer> ageList = new ArrayList<>(members.keySet());
        ageList.sort(Integer::compareTo);
        for (Integer age : ageList) {
            System.out.println(age + " " + members.get(age));
        }

    }
}
