package step4;

import java.io.*;

// 8985
public class OXQuiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int count = 0;
            int sum = 0;

            for (byte value : br.readLine().getBytes()) {

                if (value == 'O') {
                    count++;
                    sum += count;
                }
                else { count = 0; }
            }
            text.append(sum).append('\n');
        }
        wr.write(String.valueOf(text));
        wr.close();
    }
}
