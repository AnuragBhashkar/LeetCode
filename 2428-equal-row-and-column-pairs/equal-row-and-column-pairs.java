class Solution {
    public int equalPairs(int[][] grid) {
        int count=0;
        int n=grid.length;
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                boolean isEqual=true;
                for(int i=0;i<n;i++){
                    if(grid[i][c]!=grid[r][i]){
                        isEqual=false;
                        break;
                    }
                }
                if(isEqual) count++;
            }
        }
        return count;
    }
}