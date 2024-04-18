class Solution {
    public int islandPerimeter(int[][] grid) {
        
         int totalPerimeter = 0;
        for(int row =0;row<grid.length;row++){
            for(int element = 0; element<grid[0].length; element++){
                totalPerimeter+=contribution(row,element,grid);
            }
        }
        return totalPerimeter;
    }


    private static int contribution(int i,int j, int[][] grid){
        if(grid[i][j]==0) return 0;
        
        int   up   = ( i==0 || grid[i-1][j] == 0 )? 1 : 0;
        int  down  = (i==grid.length-1 || grid[i+1][j] == 0)? 1:0;
        int  left  = ( j==0 || grid[i][j-1] == 0)? 1:0;
        int right  = (j==grid[0].length-1 || grid[i][j+1] == 0)? 1:0;
        return up+down+left+right;
        
    }
}