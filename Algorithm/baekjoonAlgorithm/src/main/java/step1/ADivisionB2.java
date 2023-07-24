package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10430
public class ADivisionB2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int A = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());
        int C = Integer.parseInt(stringTokenizer.nextToken());

        StringBuilder sb = new StringBuilder();

        sb.append((A + B) % C);
        sb.append("\n");
        sb.append(((A % C) + (B % C)) % C);
        sb.append("\n");
        sb.append((A * B) % C);
        sb.append("\n");
        sb.append(((A % B) * (B % C)) % C);
        System.out.println(sb);
    }
}
