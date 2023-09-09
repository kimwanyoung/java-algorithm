package algorithm.programmers.failurerate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> stageFailure = new HashMap<>();
        int[] playerFailCount = new int[N + 2];
        int[] playerTotalCount = new int[N + 1];

        for (int playerCnt : stages) {
            playerFailCount[playerCnt]++;
        }

        playerTotalCount[N] = playerFailCount[N] + playerFailCount[N + 1];
        for (int i = N - 1; i >= 1; i--) {
            playerTotalCount[i] = playerFailCount[i] + playerTotalCount[i + 1];
        }

        for (int i = 1; i < playerTotalCount.length; i++) {
            if (playerFailCount[i] == 0 || playerTotalCount[i] == 0) {
                stageFailure.put(i, 0.0);
                continue;
            }

            double failure = (double) playerFailCount[i] / playerTotalCount[i];
            stageFailure.put(i, failure);
        }

        List<Integer> stageNumber = new ArrayList<>(stageFailure.keySet());
        stageNumber.sort((s1, s2) -> Double.compare(stageFailure.get(s2), stageFailure.get(s1)));

        return stageNumber.stream().mapToInt(Integer::intValue).toArray();
    }
}
