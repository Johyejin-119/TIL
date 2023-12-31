package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1316
public class GroupWordCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = n;
        
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            boolean check[] = new boolean[26];

            for (int j = 0; j < s.length()-1; j++) {
                if (s.charAt(j) != s.charAt(j+1)) {
                    if (check[s.charAt(j + 1) - 97]) {
                        count--;
                        break;
                    }
                }
            check[s.charAt(j)-97] = true;
            }
        }
        System.out.println(count);
    }
}
