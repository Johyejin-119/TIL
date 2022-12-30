package step5;

import java.util.Arrays;

// 15596
public class IntegerNSum {
    long sum(int[] a) {
        long sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}

/*
public class IntegerNSum {
    long sum(int[] a) {
        return Arrays.stream(a).sum();
    }
}
*/