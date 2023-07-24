package step3;

import java.io.*;
import java.util.Base64;
import java.util.StringTokenizer;

// 10951
public class APlusBTest3 {
    public static void main(String[] args) throws IOException {
/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write((a + b) + "\n");
        }
        bw.close();
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            // 문자에 숫자가 있을 때 아스키코드 값을 int 형으로 변환
            int a = str.charAt(0) -'0';
            int b = str.charAt(2) -'0';
            sb.append(a + b).append("\n");
        }
        System.out.println(sb);
    }
}
