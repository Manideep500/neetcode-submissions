class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char c1=Character.toLowerCase(c);
            if(Character.isLetterOrDigit(c1))
            {
                res=res+c1;
            }
        }
        return res.equals(new StringBuilder(res).reverse().toString());
        
    }
}
