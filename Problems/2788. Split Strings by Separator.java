class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        
        // String sep=String.valueOf(separator);
        // System.out.println(sep);
        
        List<String> ans=new ArrayList<>();


        for(String s: words){
            String ar[]=s.split("\\"+separator);
            
            for(String x:ar)
                if(x.length()>0)
                ans.add(x);
            
            // System.out.println(s);
        }
        
        return ans;
        
    }
}