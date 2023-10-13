package algorithm.programmers.최소직사각형;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int[][] sizes) {
        PriorityQueue<Integer> width = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> height = new PriorityQueue<>(Comparator.reverseOrder());

        for(int[] size : sizes) {
            int w = size[0];
            int h = size[1];

            if(h > w) {
                width.add(h);
                height.add(w);
                continue;
            }
            width.add(w);
            height.add(h);
        }


        return width.peek() * height.peek();
    }
}
