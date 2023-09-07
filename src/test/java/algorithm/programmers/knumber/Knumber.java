package algorithm.programmers.knumber;

import java.util.ArrayList;
import java.util.Arrays;

public class Knumber {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int[] command : commands) {
            int startIndex = command[0] - 1;
            int endIndex = command[1];
            int findIndex = command[2];
            int[] slicedArray = getSortedSliceOfArray(array, startIndex, endIndex);

            answer.add(slicedArray[findIndex - 1]);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] getSortedSliceOfArray(int[] array, int startIndex, int endIndex) {
        int[] arr = new int[endIndex - startIndex];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[startIndex + i];
        }

        Arrays.sort(arr);
        return arr;
    }
}
