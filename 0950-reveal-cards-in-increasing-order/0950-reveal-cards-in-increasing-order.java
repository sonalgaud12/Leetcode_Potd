class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        
        int n = deck.length;
        int arr[] = new int[n];
        Queue<Integer> que = new LinkedList<>();
        Arrays.sort(deck);
        
        for(int i=0;i<n;i++){
            que.add(i);
        }
        
        int i=0;
        while(!que.isEmpty()){
            arr[que.poll()] = deck[i++];
            
            if(!que.isEmpty()) que.add(que.poll());  
            
            
        }
        return arr;
        
    }
}


