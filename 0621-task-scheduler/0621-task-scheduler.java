class Solution {
    public int leastInterval(char[] tasks, int n) {
      int count[]=new int[26];
        for(char ch: tasks){
            count[ch-'A']++;
        }
        Arrays.sort(count);
        int mxVal=count[25]-1;
        int idle=mxVal*n;
        for(int i=24;i>=0;i--){
            idle-=Math.min(count[i],mxVal);
        }
        return idle>0?idle+tasks.length:tasks.length;   
    }
}