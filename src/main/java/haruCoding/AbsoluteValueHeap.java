package haruCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 11286
public class AbsoluteValueHeap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(((o1, o2) -> {
            int abs_o1 = Math.abs(o1);
            int abs_o2 = Math.abs(o1);
            if (abs_o1 == abs_o2) {
                return o1 > o2 ? 1 : -1;
            }
            return abs_o1 - abs_o2;
        }));

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (pQueue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(pQueue.poll());
                }
            } else {
                pQueue.add(x);
            }
        }
    }
}
