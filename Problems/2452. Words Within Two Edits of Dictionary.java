class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        
        ArrayList<String> ans=new ArrayList<>();
        
        int len=queries[0].length();
        
        for(String s:queries){
            
            for(String d:dictionary){
                
                int counter=0;
                
                for(int i=0;i<len;i++){
                    if(s.charAt(i)!=d.charAt(i))
                        counter++;
                }
                
                if(counter<=2){
                    ans.add(s);
                    break;
                }
                
            }
            
        }
        
        return ans;
        
    }
}