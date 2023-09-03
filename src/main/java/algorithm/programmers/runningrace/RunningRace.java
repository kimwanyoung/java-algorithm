package algorithm.programmers.runningrace;

import java.util.HashMap;

public class RunningRace {

	public String[] solution(String[] players, String[] callings) {
		HashMap<String, Integer> basedOnName = new HashMap<>();
		HashMap<Integer, String> basedOnRank = new HashMap<>();

		int rank = 1;
		for(String player: players) {
			basedOnRank.put(rank, player);
			basedOnName.put(player, rank);

			rank++;
		}

		for(String call: callings) {
			int callingRank = basedOnName.get(call);
			String frontPlayer = basedOnRank.get(callingRank - 1);

			basedOnName.replace(call, callingRank - 1);
			basedOnRank.replace(callingRank - 1, call);

			basedOnName.replace(frontPlayer, callingRank);
			basedOnRank.replace(callingRank, frontPlayer);
		}

		return basedOnRank.values().toArray(new String[0]);
	}

}
