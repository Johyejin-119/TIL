package step5;

// 4673
public class SelfNumber {
    public static int self(int n) {
        int sum = n;

        while (n != 0) {
            sum = sum + (n % 10);   // originNumber
            n = n / 10;             // newNumber
        }

        return sum;
    }

    public static void main(String[] args) {
        boolean checkNum[] = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            int n = self(i);

            if (n < 10001) checkNum[n] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            if (!checkNum[i]) sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
