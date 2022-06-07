package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class APlusB {
    public static void main(String[] args) throws IOException {

        // Scanner 사용
        /*
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
        scanner.close();
        */


        // BufferedReader 사용

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Buffer 에 담은 값을 StringTokenizer 로 구분하고 -> nextToken 으로 반환
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        // 반환 할 때, Integer 형으로 변환
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        System.out.println(a + b);




        // BufferedReader - Spilt 사용
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Buffer 로 읽어들인 데이터를 공백단위로 나눠서 String 배열 객체에 담기
        String[] str = bufferedReader.readLine().split(" ");

        // str 에 담긴 데이터를 하나씩 빼서 Integer 로 형변환
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        System.out.println(a + b);
        */
    }
}
