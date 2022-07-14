import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        ArrayList < Integer > list = new ArrayList < Integer > ();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                if (i == arr.length - 2) {
                    list.add(arr[i + 1]);
                }
                continue;
            } else {
                list.add(arr[i]);
                if (i == arr.length - 2) {
                    list.add(arr[i + 1]);
                }
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}