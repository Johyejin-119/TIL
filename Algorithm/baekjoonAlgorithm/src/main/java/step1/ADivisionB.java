package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1008
public class ADivisionB {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        double a = Integer.parseInt(stringTokenizer.nextToken());
        double b = Integer.parseInt(stringTokenizer.nextToken());
        double z = a / b;

        System.out.println(z);
    }
}
