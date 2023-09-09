package algorithm.programmers.coke;

public class Coke {
    public int solution(int a, int b, int n) {
        int totalCoke = 0;

        while(n >= a) {

            totalCoke += n / a * b;
            int remain = n % a;

            n = (n / a * b) + remain;
        }

        return totalCoke;
    }
}
