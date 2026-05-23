public class Solution {

    public String encode(List<String> strs) {
        StringBuilder str=new StringBuilder();
        for(String str1:strs)
        {
            str.append(str1.length()).append('#').append(str1);
        }
        return new String(str);

    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
        int j=i;
        while(str.charAt(j)!='#')
        {
        j++;
    }
    int val=Integer.parseInt(str.substring(i,j));
    i=j+1;
    j=val+i;
    list.add(str.substring(i,j));
    i=j;
        }
        return list;
    }

}
