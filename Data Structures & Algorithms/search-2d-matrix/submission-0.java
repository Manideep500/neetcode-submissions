class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int r=m*n-1;
        int mid=0;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            int val=matrix[mid/n][mid%n];
            if(val==target)
            {
                return true;
            }
            else if(val<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
       return false; 
    }

}
