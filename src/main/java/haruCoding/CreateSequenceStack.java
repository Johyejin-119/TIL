package haruCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 1874
public class CreateSequenceStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        int s_value = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] >= s_value) {
                while (seq[i] == s_value) {
                    stack.push(s_value++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else {
                stack.pop();
            }
        }

    }
}
