class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str=s.toCharArray();
        char[] str1=t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(str1);
        String s1=new String(str);
        String s2=new String(str1);

    
    
    return s1.equals(s2);
    }
}
