class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i;j<nums.length-1;j++)
        //     {
        //         if(i==j)
        //         {
        //             return true;
        //         }
        //     }
        // }

    
// return false;
HashSet<Integer> set=new HashSet<>();
for(int num:nums)
{
    if(set.contains(num))
    {
        return true;
    }
    set.add(num);
    }


return false;
}
}