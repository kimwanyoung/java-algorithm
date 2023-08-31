package programmers;

import java.util.HashMap;

public class Clothes {
	public static int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> clothesHash = new HashMap<>();
		for(String[] c : clothes) {
			if(clothesHash.containsKey(c[1])) {
				int tmp = clothesHash.get(c[1]);
				clothesHash.put(c[1], tmp + 1);
			} else {
				clothesHash.put(c[1], 2);
			}
		}

		for(String key : clothesHash.keySet()){
			answer *= clothesHash.get(key);
		}

		return answer - 1;
	}
}
