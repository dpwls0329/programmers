// import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 1
        int answer = 0;
        int i, j, k;

        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                for (k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    public static boolean isPrime(int sum) {
        boolean result = true;
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                result = false;
                break;
            }
        }
        return result;

        // 2
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // int answer = 0;
        // int i, j, k, z;

        // for(i=0; i<nums.length; i++){
        //     for(j=i+1; j<nums.length; j++){
        //         for(k=j+1; k<nums.length; k++){
        //             int sum = nums[i] + nums[j] + nums[k];
        //             list.add(sum);
        //         }
        //     }
        // }
        // for(int sum : list){
        //     for(z=2; z<sum; z++){
        //         if(sum % z == 0){
        //             answer--;
        //             break;
        //         }
        //     }
        //     answer++;
        // }
        // return answer;

        // 3
        // int answer = 0;

        // for (int fir = 0; fir < nums.length - 2; fir++) {
        //     for (int sec = fir + 1; sec < nums.length - 1; sec++) {
        //         for (int thr = sec + 1; thr < nums.length; thr++) {
        //             int count =0;
        //             int sum=(nums[fir] + nums[sec] + nums[thr]);
        //             for(int k=1; k<=sum; k++){
        //                 if(sum%k==0){
        //                     count+=1;
        //                 }
        //             }
        //             if(count==2){
        //                 answer+=1;
        //             }
        //                 count=0;
        //         }
        //     }
        // }
        // return answer;
    }
}
