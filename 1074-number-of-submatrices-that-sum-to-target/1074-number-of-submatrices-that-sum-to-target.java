class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        
        for(int i=0;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                matrix[i][j]=matrix[i][j]+matrix[i][j-1];
            }
        }
        
        int count=0;
        
        for(int i=0;i<col;i++)
        {
            for(int j=i;j<col;j++)
            {
                Map<Integer, Integer> map=new HashMap<>();
                map.put(0, 1);
                int sum=0;
                
                for(int k=0;k<row;k++)
                {   
                    if(i==0)
                    {
                        sum=sum+matrix[k][j];
                    }
                    else
                    {
                        sum=sum+(matrix[k][j]-matrix[k][i-1]);
                    }
                    
                    if(map.containsKey(sum-target)==true)
                    {
                        count=count+map.get(sum-target);
                    }
                    
                    map.put(sum, map.getOrDefault(sum, 0)+1);
                }
            }
        }
        
        return count;
    }
}