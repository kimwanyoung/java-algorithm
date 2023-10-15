package algorithm.programmers.큰수만들기;

public class Solution {
    public String solution(String number, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = number.toCharArray();
        int len = array.length - k;
        int start = 0;

        for (int i = 0; i < len; i++) {
            char max = '0';
            for (int j = start; j <= i + k; j++) {
                if (array[j] > max) {
                    max = array[j];
                    start = j + 1;
                }
            }
            stringBuilder.append(max);
        }

        return stringBuilder.toString();
    }
}
