package algorithm.boj.Boj_11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int numberCount = Integer.parseInt(stringTokenizer.nextToken());
        int addCount = Integer.parseInt(stringTokenizer.nextToken());

        long[] subArray = new long[numberCount + 1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 1; i <= numberCount; i++) {
            subArray[i] = subArray[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int i = 0; i < addCount; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(subArray[end] - subArray[start - 1]);
        }
    }
}
