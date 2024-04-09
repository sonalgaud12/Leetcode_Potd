class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> que = new LinkedList<>();
        int count=0;
        
        for(int i=0;i<tickets.length;i++){
            que.add(i);
        }
        
        while(!que.isEmpty()){
            int idx=que.poll();
            tickets[idx]--;
            count++;
            
            if(tickets[idx]==0 && idx == k){
                return count;
            }
            
            if(tickets[idx] > 0){
                que.add(idx);
            }
        }
        return count;
        }
}