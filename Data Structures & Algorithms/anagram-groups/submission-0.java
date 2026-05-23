class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String c:strs)
        {
            char[] c1=c.toCharArray();
            Arrays.sort(c1);
            String str=new String(c1);
            map.putIfAbsent(str,new ArrayList<>());
            map.get(str).add(c);
            
        }
        return new ArrayList<>(map.values());

        
    }
}
