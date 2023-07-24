package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2566
public class Maximum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;

        int[][] size = new int[9][9];
        int temp = 0, row = 0, column = 0;

        for (int i = 0; i < size.length; i++) {
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < size[i].length; j++) {

                size[i][j] = Integer.parseInt(str.nextToken());
                System.out.println("i  = " + i + ", j  = " + j);
                //System.out.println("size"+"[" + i + "]"+"[" + j + "]" + " = " + size[i][j]);
                //System.out.println();

                if (temp < size[i][j]) {
                    temp = size[i][j];
                    row = i;
                    column = j;
                }
                System.out.println(temp);
            }
        }
        System.out.println(temp + "\n" + (row+1) + " " + (column+1));

    }
}
