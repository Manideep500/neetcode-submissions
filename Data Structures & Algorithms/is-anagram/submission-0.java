class Solution {
    public boolean isAnagram(String s, String t) {
    // char[] str=s.toCharArray();
    // char[] str1=t.toCharArray();
    // Arrays.sort(str);
    // Arrays.sort(str1);
    // return Arrays.equals(str,str1);

if(s.length()!=t.length())
{
    return false;
}
HashMap<Character,Integer> map=new HashMap();
HashMap<Character,Integer> map1=new HashMap();
for(int i=0;i<s.length();i++)
{
    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
}
return map.equals(map1);



    }
}
