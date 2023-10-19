package algorithm.programmers.멀리뛰기;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public long solution(int n) {
        return calculateJump(n);
    }

    private long calculateJump(int blockCount) {
        List<Long> countOfPossibleJump = new ArrayList<>();
        countOfPossibleJump.add(1L);
        countOfPossibleJump.add(2L);

        for(int i = 2; i < blockCount; i++){
            Long prevCount = countOfPossibleJump.get(i - 1) % 1234567L;
            Long prevPrevCount = countOfPossibleJump.get(i - 2) % 1234567L;
            countOfPossibleJump.add(prevCount + prevPrevCount);
        }

        return countOfPossibleJump.get(blockCount - 1) % 1234567L;
    }
}
