package algorithm.programmers.이중우선순위큐;

import java.util.Comparator;
import java.util.PriorityQueue;

class DoublyPriorityQueue {
    private PriorityQueue<Integer> min;
    private PriorityQueue<Integer> max;
    private int size = 0;

    DoublyPriorityQueue() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void add(Integer number) {
        min.add(number);
        max.add(number);
        size++;
    }

    public void removeMax() {
        if (size != 0) {
            max.poll();
            size--;
        }
        if (size == 0) {
            max.clear();
        }
    }

    public void removeMin() {
        if (size != 0) {
            min.poll();
            size--;
        }
        if (size == 0) {
            min.clear();
        }
    }

    public int[] getMaxAndMin() {
        if (size == 0) {
            return new int[]{0, 0};
        }

        return new int[]{max.peek(), min.peek()};
    }

    public boolean isMaxEmpty() {
        return max.isEmpty();
    }

    public boolean isMinEmpty() {
        return min.isEmpty();
    }
}


public class Solution {
    private static final String ADD = "I";
    private static final String REMOVE = "D";
    private static final int REMOVE_MAX = 1;
    private static final int REMOVE_MIN = -1;

    public int[] solution(String[] operations) {
        DoublyPriorityQueue q = new DoublyPriorityQueue();

        for (String operation : operations) {
            String[] opcode = operation.split(" ");

            if (opcode[0].equals(ADD)) {
                q.add(Integer.parseInt(opcode[1]));
            }
            if (opcode[0].equals(REMOVE)) {
                int removeCode = Integer.parseInt(opcode[1]);
                if (removeCode == REMOVE_MAX && !q.isMaxEmpty()) {
                    q.removeMax();
                }
                if (removeCode == REMOVE_MIN && !q.isMinEmpty()) {
                    q.removeMin();
                }
            }
        }

        return q.getMaxAndMin();
    }
}
