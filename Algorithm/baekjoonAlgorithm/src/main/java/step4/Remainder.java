package step4;

import java.io.*;
import java.util.HashSet;

// 3052
public class Remainder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> num = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            num.add(Integer.parseInt(br.readLine()) % 42);
        }
        bw.write(String.valueOf(num.size()));
        bw.close();
    }
}
