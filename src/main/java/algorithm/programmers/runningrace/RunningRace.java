package algorithm.programmers.runningrace;

import java.util.HashMap;

public class RunningRace {

	public String[] solution(String[] players, String[] callings) {
		HashMap<String, Integer> basedOnName = new HashMap<>();
		HashMap<Integer, String> basedOnRank = new HashMap<>();

		int rank = 1;
		for (String player : players) {
			basedOnRank.put(rank, player);
			basedOnName.put(player, rank);

			rank++;
		}

		for (String call : callings) {
			int callingRank = basedOnName.get(call);
			String frontPlayer = basedOnRank.get(callingRank - 1);

			mapSwap(basedOnName, basedOnRank, call, callingRank - 1);
			mapSwap(basedOnName, basedOnRank, frontPlayer, callingRank);
		}

		return basedOnRank.values().toArray(new String[0]);
	}

	public void mapSwap(HashMap<String, Integer> nameMap, HashMap<Integer, String> rankMap, String call,
		int callingRank) {
		nameMap.replace(call, callingRank);
		rankMap.replace(callingRank, call);
	}

}
