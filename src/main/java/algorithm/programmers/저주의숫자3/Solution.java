package algorithm.programmers.저주의숫자3;

class Solution {

    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            answer += 1;
            while(isThreeNumber(answer)) {
                answer += 1;
            }
        }
        return answer;
    }

    public boolean isThreeNumber(int n) {
        return  String.valueOf(n).contains("3") || n % 3 == 0;
    }
}
