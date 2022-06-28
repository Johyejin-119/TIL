package step3;

import java.io.*;
import java.util.StringTokenizer;

// 1110
public class PlusCycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        br.close();

        String num = n;
        String next = null;
        int cycle = 0;


        while (!n.equals(next)) {
            if (Integer.parseInt(n) <= 1) {
                int a = 0;
                int b = num.charAt(0) -'0';
                int c = a + b;
                next  = String.valueOf(b) +(c % 10);
                cycle++;
                num = next;
            } else {
                int a = num.charAt(0) -'0';
                int b = num.charAt(1) -'0';
                System.out.println("a = " + a);
                System.out.println("b = " + b);

                int c = a + b;
                System.out.println("c = " + c);

                next = String.valueOf(b) + (c % 10);
                System.out.println("next = " + next);

                cycle++;
                num = next;
            }
        }
        bw.write(String.valueOf(cycle));
        bw.close();

    }
}
