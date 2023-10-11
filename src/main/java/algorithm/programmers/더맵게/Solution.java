package algorithm.programmers.더맵게;

import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int K) {
        // 우선순위 큐로 정렬상태로 초기화
        PriorityQueue<Integer> scovilleQ = new PriorityQueue<>();
        int count = 0;

        for(Integer scovilleNumber: scoville) {
            scovilleQ.add(scovilleNumber);
        }

        // 제일 작은 수가 K보다 작으면 반복
        while(scovilleQ.peek() < K) {
            if(scovilleQ.size() == 1) {
                return -1;
            }

            int newScoville = scovilleQ.poll() + scovilleQ.poll() * 2;
            scovilleQ.add(newScoville);
            count++;
        }

        return count;
    }
}
