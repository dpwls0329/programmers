import java.util.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        // HashSet<Integer> hash = new HashSet<>();
        // for(int i=0; i<numbers.length; i++){
        //     for(int j=i+1; j<numbers.length; j++){
        //         int sum = numbers[i] + numbers[j];
        //         hash.add(sum);
        //         }
        //     }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if(list.indexOf(sum) < 0){
                    list.add(sum);
                }
            }
        }
        
        // ArrayList<Integer> list = new ArrayList<Integer>(hash);
        // ArrayList<Integer> list = new ArrayList<Integer>();
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}