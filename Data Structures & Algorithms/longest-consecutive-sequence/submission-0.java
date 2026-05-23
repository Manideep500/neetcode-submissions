class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int max=0;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int num1:set)
        {
            int count=0;
            int res=num1;
            // int max=0;
            while(set.contains(res))
            {
                count++;
                res++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
