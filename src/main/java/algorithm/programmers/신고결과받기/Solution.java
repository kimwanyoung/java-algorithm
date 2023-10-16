package algorithm.programmers.신고결과받기;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Integer> idxMap = new HashMap<>();
        HashMap<String, HashSet<String>> hashMap = new HashMap<>();
        HashMap<String, Integer> count = new HashMap<>();
        ArrayList<String> stopUser = new ArrayList<>();

        for (int i = 0; i < id_list.length; i++) {
            idxMap.put(id_list[i], i);
        }

        for (int i = 0; i < report.length; i++) {
            String a = report[i].split(" ")[0];
            String b = report[i].split(" ")[1];

            hashMap.computeIfAbsent(a, k1 -> new HashSet<>());
            HashSet<String> strings = hashMap.get(a);
            strings.add(b);
            hashMap.put(a, strings);
        }

        for (Map.Entry<String, HashSet<String>> s : hashMap.entrySet()) {
            String key = s.getKey();
            HashSet<String> value = s.getValue();
            for (String t : value) {
                count.put(t, count.getOrDefault(t, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> s2 : count.entrySet()) {
            String key1 = s2.getKey();
            int value1 = s2.getValue();
            if (value1 >= k) {
                stopUser.add(key1);
            }
        }

        int[] answer = new int[id_list.length];
        for (Map.Entry<String, HashSet<String>> s : hashMap.entrySet()) {
            String key = s.getKey();
            HashSet<String> value = s.getValue();
            for (String stop : stopUser) {
                if (value.contains(stop)) {
                    answer[idxMap.get(key)]++;
                }
            }
        }
        return answer;
    }
}
