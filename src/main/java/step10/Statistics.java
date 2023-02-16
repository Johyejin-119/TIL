package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 2108
public class Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> numbers = new ArrayList<>();
        StringBuilder sb =  new StringBuilder();

        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(numbers);

        // average
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        sb.append((int)Math.round(average));

        // center
        int center = numbers.get((N / 2));
        sb.append(center);



    }
}
