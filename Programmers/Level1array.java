import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i<arr.length; i++) {
            if(i == 1) {
                q.add(arr[0]);
            }
            if(arr[i-1] != arr[i]) {
               q.add(arr[i]); 
            }
        }

        int[] answer = new int[q.size()];
        for(int i = 0; i<answer.length; i++) {
            answer[i] = q.poll();
        }

        return answer;
    }
}
