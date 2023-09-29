package algorithm.programmers.개인정보수집유효기간;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        String[] splitedDate = today.split("\\.");

        for (int i = 0; i < terms.length; i++) {
            map.put(terms[i].split(" ")[0], terms[i].split(" ")[1]);
        }

        int year = Integer.parseInt(splitedDate[0]);
        int month = Integer.parseInt(splitedDate[1]);
        int day = Integer.parseInt(splitedDate[2]);

        for (int i = 0; i < privacies.length; i++) {
            String date = privacies[i].split(" ")[0];
            String[] splitedPrivacies = date.split("\\.");
            int type = Integer.parseInt(map.get(privacies[i].split(" ")[1]))*28;

            int num = (year - Integer.parseInt(splitedPrivacies[0]))*28*12
                    + (month - Integer.parseInt(splitedPrivacies[1]))*28
                    + (day - Integer.parseInt(splitedPrivacies[2]));

            if (num >= type) {
                list.add(i+1);
            }
        }

        return list.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
    }
}
