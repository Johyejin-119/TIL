package zerobasecodingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 27958
public class ShootingPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        ArrayList<Integer> numList = new ArrayList<>();
        int[][] boardNum = new int[N][N];
        int[] shoot = new int[K];
        int score = 0;


        for (int row = 0; row < N; row++) {
            str = new StringTokenizer(br.readLine(), " ");
            for (int col = 0; col < N; col++) {
                int temp = Integer.parseInt(str.nextToken());
                numList.add(temp);
                boardNum[row][col] = temp;
            }
        }

        str = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < K; i++) {
            shoot[i] = Integer.parseInt(str.nextToken());
        }

        br.close();

        Collections.sort(numList);
        Collections.reverse(numList);
        for (int k = 0; k < shoot.length; k++) {
            for (Integer num : numList) {
                if (num >= 10) {
                    score += num;
                } else {
                    if (num >= 0) {
                        if (num > k) {
                            num -= k;
                            checkOfNumberIsZero(N, num, boardNum, score);
                        } else {
                            score += num;
                        }
                    }
                }
            }
        }
        System.out.println(score);
    }
    private static void checkOfNumberIsZero(int N, Integer num, int[][] boardNum, int score) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (num == boardNum[row][col] && 4 <= num && num <= 9) {
                    score += num;
                    if (row + 1 < N && boardNum[row + 1][col] == 0) boardNum[row + 1][col] = num / 4;
                    if (col + 1 < N && boardNum[row][col + 1] == 0) boardNum[row][col + 1] = num / 4;
                    if (row - 1 >= 0 && boardNum[row - 1][col] == 0) boardNum[row - 1][col] = num / 4;
                    if (col - 1 >= 0 && boardNum[row][col - 1] == 0) boardNum[row][col - 1] = num / 4;
                }
            }
        }
    }
}
