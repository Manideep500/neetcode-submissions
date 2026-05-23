class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int res=0;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int num1:set)
        {
            int count=0;
            int val=num1;
            while(set.contains(val))
            {
                count++;
                val++;
            }
            res=Math.max(res,count);

        }
        return res;
    }
}
