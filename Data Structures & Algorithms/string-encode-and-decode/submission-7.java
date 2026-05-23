class Solution {

    public String encode(List<String> strs) {
        StringBuilder build=new StringBuilder();
        for(String str:strs)
        {
            build.append(str.length()).append('#').append(str);
        }
       return new String(build);
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
            j=i+val;
            list.add(str.substring(i,j));
            i=j;
        }
        return list;
    }
}
