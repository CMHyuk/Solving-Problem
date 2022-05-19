class Solution {
    public int solution(int n) {
        int answer = 0;

        boolean[] bool = new boolean[n+1];

        for(int i = 2; i<bool.length; i++) {
            for(int j = 2; i*j<bool.length; j++) {
                bool[i*j] = true;
            }
        }

        for(int i = 2; i<=n; i++) {
            if(bool[i] == false) {
                answer++;
            }
        }
        return answer;
    }
}