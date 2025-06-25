class Solution {
    public int solution(int[] players, int m, int k) {
        int[] counts = new int[24];
        int current = 0;
        int answer = 0;
        
        for (int i = 0; i < 24; i++){
            if(i - k >= 0){
                current -= counts[i - k];
            }
            if(players[i]/ m <= current){
                continue;
            }
            counts[i] = players[i]/m - current;
            current += counts[i];
            answer += counts[i];
        }
        return answer;
    }
}