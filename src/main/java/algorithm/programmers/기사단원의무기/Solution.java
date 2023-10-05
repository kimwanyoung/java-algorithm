package algorithm.programmers.기사단원의무기;

import java.util.Arrays;

public class Solution {
    public int solution(int number, int limit, int power) {
        int[] weapons = new int[number + 1];

        for(int i = 1; i <= number; i++) {
            int soldierPower = getDivisorCount(i);
            if(soldierPower > limit) {
                weapons[i] = power;
            } else {
                weapons[i] = soldierPower;
            }
        }

        return Arrays.stream(weapons).reduce(0, Integer::sum);
    }

    public int getDivisorCount(int number) {
        int count = 0;
        for(int i = 1; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                count++;
                if(number / i != i) {
                    count++;
                }
            }
        }

        return count;
    }
}
