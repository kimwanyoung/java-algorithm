package algorithm.boj.카드2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cardNumber = sc.nextInt();
        Queue<Integer> deck = new LinkedList<>();

        for (int i = 1; i <= cardNumber; i++) {
            deck.add(i);
        }

        while (deck.size() > 1) {
            deck.poll();
            int topNum = deck.poll();
            deck.add(topNum);
        }

        System.out.println(deck.poll());
    }
}
