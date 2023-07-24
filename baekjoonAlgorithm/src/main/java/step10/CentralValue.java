package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 2587
public class CentralValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> N = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            N.add(Integer.parseInt(br.readLine()));
        }
        Integer sum = N.stream().reduce(0, Integer::sum);
        System.out.println(sum / 5);

        double average = N.stream().mapToInt(Integer:: intValue).average().orElse(0);
        System.out.println((int)Math.round(average));

        Integer center = N.stream().sorted().skip(2).findFirst().orElse(0);
        System.out.println(center);
    }
}
