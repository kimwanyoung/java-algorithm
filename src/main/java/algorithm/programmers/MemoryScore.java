package algorithm.programmers;

import java.util.Arrays;
import java.util.HashMap;

class MemoryScore {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		HashMap<String, Integer> memoryScore = new HashMap<>();
		int[] answer = new int[photo.length];
		int index = 0;

		for(int i = 0 ; i < name.length; i++) {
			memoryScore.put(name[i], yearning[i]);
		}

		for(String[] memory: photo) {
			for(String m : memory) {
				if(memoryScore.get(m) == null) {
					continue;
				}
				answer[index] += memoryScore.get(m);
			}

			index++;
		}

		return answer;
	}
}
