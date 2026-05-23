class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs)
        {
            char[] str1=str.toCharArray();
            Arrays.sort(str1);
            String st=new String(str1);
            map.putIfAbsent(st,new ArrayList<>());
            map.get(st).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
