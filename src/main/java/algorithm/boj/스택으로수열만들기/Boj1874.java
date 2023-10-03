package algorithm.boj.스택으로수열만들기;

import java.util.Scanner;
import java.util.Stack;

public class Boj1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0 ; i < N; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;
        StringBuilder bf = new StringBuilder();

        for(int i = 0 ; i < N; i++){
            int s = arr[i];
            if(s >= num){
                while(s >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                int n = stack.pop();
                if(n > s) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if (result) {
            System.out.println(bf.toString());
        }
    }
}
