package step4;

import java.io.*;

// 8985
public class OXQuiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        StringBuffer text = new StringBuffer();
        for (int i = 0; i < num; i++) {
            text.append(br.readLine());

        }

    }
}
