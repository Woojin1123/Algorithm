import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        Queue<Integer> q = new LinkedList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i<speeds.length; i++){
            q.add((int)(Math.ceil((100.0-progresses[i])/speeds[i])));
        }
        
        
        int count = 0;
        int first = q.peek();
        
        while(!q.isEmpty()){
            if(q.peek() <= first){
                q.poll();
                count++;
            }else{
                list.add(count);
                count = 1;
                first = q.poll();
            }
        }
        list.add(count);

        answer  = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}