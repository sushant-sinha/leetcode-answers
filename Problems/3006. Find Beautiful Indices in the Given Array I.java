class Solution {
    
    TreeSet<Integer> index=new TreeSet<>();
    
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        
        List<Integer> ans=new ArrayList<>();
        helper(s, b);
        
        for(int i=0;i<=s.length()-a.length();i++){
            
            int start=i;
            boolean flag=true;
            
            for(int j=0;j<a.length();j++){
                if(s.charAt(start+j)!=a.charAt(j)){
                    flag=false;
                    break;
                }
            }
            
            if(flag){
                
                int startIndex= i-k>0 ? i-k : 0;
                int endIndex= i+k<s.length() ? i+k : s.length()-1;
                
                Integer ceil=index.ceiling(i);
                Integer flr=index.floor(i);
                
                // System.out.println(ceil+" "+flr+" "+i+" strt="+startIndex+" end="+endIndex);
                
                if(ceil!=null && ceil<=endIndex){
                    ans.add(i);
                }
                else if(flr!=null && flr>=startIndex){
                    ans.add(i);
                }
                
            }
            
            
        }
        
        return ans;
    }
    
    void helper(String s, String b){
        
        for(int i=0;i<=s.length()-b.length();i++){
            
            int start=i;
            boolean flag=true;
            
            for(int j=0;j<b.length();j++){
                if(s.charAt(start+j)!=b.charAt(j)){
                    flag=false;
                    break;
                }
            }
            
            if(flag){
                index.add(i);
                i+=b.length()-1;
            }
            
        }
    }
}