package algorithm.boj.절대값힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Boj11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> absHeap = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if (first == second) {
                return o1 - o2;
            }
            return first - second;
        });
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if (absHeap.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(absHeap.poll());
                }
            } else {
                absHeap.add(request);
            }

        }
    }
}
