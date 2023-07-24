package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 2750
public class NumberSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> number = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            number.add(Integer.parseInt(br.readLine()));
        }
        number.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
    }
}
