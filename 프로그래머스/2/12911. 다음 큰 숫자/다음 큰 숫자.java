class Solution {
    public int solution(int n) {
        int answer = n;
        int count = Integer.bitCount(n);
        
        while(true){
            int nextCount = Integer.bitCount(++answer);
            
            if(nextCount == count){
                break;
            }
        }
        return answer;
    }
}