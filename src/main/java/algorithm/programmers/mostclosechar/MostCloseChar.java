package algorithm.programmers.mostclosechar;

public class MostCloseChar {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            String current = s.substring(i, i + 1);
            int indexOf = sb.lastIndexOf(current);

            if(indexOf == -1) {
                answer[i] = -1;
            }

            if(indexOf > -1) {
                answer[i] = i - indexOf;
            }

            sb.append(current);
        }

        return answer;
    }
}
