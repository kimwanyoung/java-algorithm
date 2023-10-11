package algorithm.programmers.전화번호목록;

/*
    전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
    어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 */

import java.util.Arrays;

public class Solution {


    public boolean solution(String[] phone_book) {
        // String 정렬
        Arrays.sort(phone_book);

        // 정렬 상태이기 때문에 앞 뒤만 체크하면 접두사가 같은지 확인 가능
        for(int i = 0; i < phone_book.length - 1; i++){
            if(phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }
}
