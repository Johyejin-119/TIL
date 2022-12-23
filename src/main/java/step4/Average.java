package step4;

import java.io.*;
import java.util.*;

// 1546
public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        //double arr[] = new double[Integer.parseInt(br.readLine())];
        int n = Integer.parseInt(br.readLine());
        ArrayList<Double> scoreList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        // input
        for (int i = 0; i < n; i++) {
            //arr[i] = Double.parseDouble(st.nextToken());
            scoreList.add(Double.parseDouble(st.nextToken()));
        }

        Double maxScore = Collections.max(scoreList);
        ArrayList<Double> averageScore = new ArrayList<>();
        for (int i = 0; i < scoreList.size(); i++) {
            averageScore.add((scoreList.get(i) / maxScore) * 100);
        }


        // output
        DoubleSummaryStatistics statistics = averageScore
                .stream()
                .mapToDouble(num -> num)
                .summaryStatistics();
        wr.write(String.valueOf(statistics.getAverage()));
        wr.close();


    }
}
