package step3;

import java.io.*;

// 1110
public class PlusCycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int count = 0;
        int next = num;

        do {
            num = ((num % 10) * 10) + (((num/10) + (num%10)) %10);
            count++;
        } while (next != num);
        bw.write(String.valueOf(count));
        bw.close();

/*

        String n = br.readLine();
        br.close();

        String num = n;
        String next = null;
        int cycle = 0;

        do {
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
        } while (num != n);

        bw.write(String.valueOf(cycle));
        bw.close();
*/

    }
}
