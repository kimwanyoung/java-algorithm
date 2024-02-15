package algorithm.programmers.캐시;

import java.util.ArrayList;

public class Solution {

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> cache = new ArrayList<>();

        if(cacheSize == 0) {
            return cities.length * 5;
        }

        for (String city : cities) {
            String cityName = city.toUpperCase();
            if(cache.contains(cityName)) {
                cache.remove(cityName);
                cache.add(cityName);
                answer += 1;
            } else {
                if(cache.size() == cacheSize) {
                    cache.remove(0);
                    cache.add(cityName);
                } else {
                    cache.add(cityName);
                }
                answer += 5;
            }
        }
        return answer;
    }
}
