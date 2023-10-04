package algorithm.boj.소수구하기;

import java.util.Scanner;

public class Boj1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int[] primeNumbers = new int[end + 1];

        for (int i = 2; i <= end; i++) {
            primeNumbers[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(end); i++) {
            if (primeNumbers[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= end; j += i) {
                primeNumbers[j] = 0;
            }
        }

        for (int i = start; i <= end; i++) {
            if (primeNumbers[i] != 0) {
                System.out.println(primeNumbers[i]);
            }
        }
    }
}
