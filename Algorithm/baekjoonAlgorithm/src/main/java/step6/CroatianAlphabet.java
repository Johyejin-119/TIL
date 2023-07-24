package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2941
public class CroatianAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String check[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (int i = 0; i < check.length; i++) {
            if (s.contains(check[i]))
                s = s.replace(check[i], "#");
        }
        System.out.println(s.length());
    }
}
