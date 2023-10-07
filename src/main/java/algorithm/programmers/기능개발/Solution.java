package algorithm.programmers.기능개발;


import java.util.ArrayList;
public class Solution {
    private final int COMPLETE_PERCENT = 100;
    public int[] solution(int[] progresses, int[] speeds) {
        int[] remainingDays = getRemainingDays(progresses, speeds);
        return getDeployCount(remainingDays);
    }

    private int[] getRemainingDays(int[] progresses, int[] speeds) {
        int[] remainingDays = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++) {
            int remainingDay = (int)(Math.ceil(((double) COMPLETE_PERCENT - progresses[i]) / speeds[i]));
            remainingDays[i] = remainingDay;
        }

        return remainingDays;
    }

    private int[] getDeployCount(int[] remainingDays) {
        ArrayList<Integer> countArr = new ArrayList<>();
        int currentDay = remainingDays[0];
        int count = 0;

        for(int day : remainingDays) {
            if(day > currentDay) {
                countArr.add(count);
                currentDay = day;
                count = 1;
            } else {
                count++;
            }
        }

        countArr.add(count);

        int[] counts = new int[countArr.size()];

        for(int i = 0; i < counts.length; i++){
            counts[i] = countArr.get(i);
        }

        return counts;
    }
}
